package com.example.mvvmdemo.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmdemo.R
import com.example.mvvmdemo.viewmodel.CountViewModel

class CountFragment : Fragment() {

    lateinit var viewModel: CountViewModel // dùng cách này thì không cần phải khởi tạo null và không cần phải check null - cách này tương tự lazy
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this)[CountViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_count, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.count.observe(viewLifecycleOwner) {
            view.findViewById<TextView>(R.id.txt_count).text =
                it.toString()
        }

        view.findViewById<Button>(R.id.btn_count).setOnClickListener(){
            viewModel.updateCount()
        }
    }
}