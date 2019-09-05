package com.redoyp2pcommunicationtest.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.redoyp2pcommunicationtest.fragment.CommunicationFragment;
import com.redoyp2pcommunicationtest.fragment.DiscoveryAndConnectionFragment;

import java.util.List;

public class P2pCommunicationFragmentPagerAdapter extends FragmentPagerAdapter {

    public static final String FRAGMENT_TITLE = "FRAGMENT_TITLE";
    private List<Fragment> fragmentList;

    public P2pCommunicationFragmentPagerAdapter(FragmentManager fragmentManager, List<Fragment> fragmentList) {
        super(fragmentManager);
        this.fragmentList = fragmentList;
    }

    @Override
    public Fragment getItem(int i) {
        return fragmentList.get(i);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentList.get(position).getArguments().getString(FRAGMENT_TITLE);
    }

    public DiscoveryAndConnectionFragment getDiscoveryAndConnectionFragment() {
        return (DiscoveryAndConnectionFragment) getItem(0);
    }

    public CommunicationFragment getCommunicationFragment() {
        return (CommunicationFragment) getItem(1);
    }
}