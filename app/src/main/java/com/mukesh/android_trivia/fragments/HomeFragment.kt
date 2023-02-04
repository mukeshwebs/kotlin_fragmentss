package com.mukesh.android_trivia.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.mukesh.android_trivia.R
import com.mukesh.android_trivia.databinding.FragmentHomeBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

class HomeFragment : Fragment() {
    // TODO: Rename and change types of parameters


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
        val binding = DataBindingUtil.inflate<FragmentHomeBinding>(inflater,
        R.layout.fragment_home, container, false);


        return binding.root;
    }

}

//Notes

//what is the meaning of inflate
//"Inflate the layout for this fragment" is a common phrase in Android development. It means to convert the
//XML description of a user interface into a View object that can be displayed on the screen.


//why do we return in in fragments
//In Android, the return statement in a fragment is used to return a View object that
//represents the user interface of the fragment. The View object is created by inflating a layout,
//which is a XML file that defines the structure and appearance of the user interface. The inflated View is then
//added to the fragment's container, which is typically a ViewGroup, to be displayed on the screen.