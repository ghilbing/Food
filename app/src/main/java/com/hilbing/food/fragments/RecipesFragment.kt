package com.hilbing.food.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hilbing.food.databinding.ActivityMainBinding
import com.hilbing.food.databinding.FragmentRecipesBinding

class RecipesFragment : Fragment() {

    private lateinit var mBinding: FragmentRecipesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = FragmentRecipesBinding.inflate(inflater, container, false)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mBinding.recyclerview.showShimmer()
    }

}