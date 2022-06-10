package com.apolloclinicfsm.features.document

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager.widget.PagerAdapter
import com.apolloclinicfsm.CustomStatic
import com.apolloclinicfsm.features.document.presentation.DocumentTypeListFragment
import com.apolloclinicfsm.features.document.presentation.DocumentTypeListFragmentOne
import com.apolloclinicfsm.features.orderhistory.model.ActionFeed

/**
 * Created by Saheli
 */
class TabPagerAdapter(fm: FragmentManager?) : FragmentStatePagerAdapter(fm!!), ActionFeed {

    override fun refresh() {
        notifyDataSetChanged()
    }


    override fun getItem(position: Int): Fragment {
        if (position == 0) {
//            return FromOrganizationFragment()
            //CustomStatic.IsChooseTab = false
            return DocumentTypeListFragmentOne()
        } else if (position == 1) {
//            return OwnfilesFragment()
            //CustomStatic.IsChooseTab = true
            return DocumentTypeListFragment()
        } else {
            return Fragment()
        }
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getItemPosition(`object`: Any): Int {
        // Causes adapter to reload all Fragments when
        // notifyDataSetChanged is called
        return PagerAdapter.POSITION_NONE
    }
}