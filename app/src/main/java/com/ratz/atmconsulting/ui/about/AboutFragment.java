package com.ratz.atmconsulting.ui.about;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ratz.atmconsulting.R;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

/**
 * A simple {@link Fragment} subclass.
 */
public class AboutFragment extends Fragment {


    public AboutFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String description = "Lorem ipsum dolor sit amet consectetur adipisicing elit. Maxime mollitia,\n" +
                "molestiae quas vel sint commodi repudiandae consequuntur voluptatum laborum\n" +
                "numquam blanditiis harum quisquam eius sed odit fugiat iusto fuga praesentium\n" +
                "optio, eaque rerum! Provident similique accusantium nemo autem. ";

        Element version = new Element();
        version.setTitle("Version 1.0");

        return  new AboutPage(getActivity())
                .setImage(R.drawable.logo)
                .setDescription(description)

                .addGroup("Contact us")
                .addEmail("consulting@atm.com", "Let's talk'")
                .addWebsite("www.google.com", "Check our website")

                .addGroup("Follow us")
                .addFacebook("consulting", "Facebook")
                .addInstagram("consulting", "Instagram")
                .addTwitter("consulting", "Twitter")
                .addYoutube("consulting", "Youtube")
                .addGitHub("ratzPereira", "GitHub")
                .addPlayStore("link", "Check us in your mobile")

                .addItem(version)
                .create();
        //return inflater.inflate(R.layout.fragment_about, container, false);

    }

}
