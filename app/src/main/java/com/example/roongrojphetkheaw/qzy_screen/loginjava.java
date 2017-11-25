package com.example.roongrojphetkheaw.qzy_screen;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.view.LayoutInflater;

import org.w3c.dom.Text;

import static com.pchmn.materialchips.R2.id.container;


/**
 * Created by roongrojphetkheaw on 11/13/2017 AD.
 */

public class loginjava extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.login, container,false);

        initListeners();




        return rootview;

    }

    private void initListeners() {

    }


}

