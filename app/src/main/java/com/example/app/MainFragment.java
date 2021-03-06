package com.example.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Nicolas on 05/02/14.
 */
public class MainFragment extends Fragment
{

    private View view;
    private Activity activity;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        activity = super.getActivity(); //Permet de récupérer l'activité courrante
        view = inflater.inflate(R.layout.fragment_main, container, false); //Recupère la vue courante
        Log.i("makemachine", "On Create View");
        initButton();
        return view;

    }

    private void initButton()
    {
        Button buttonBiatch = (Button) view.findViewById(R.id.btn_biatch);
        buttonBiatch.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //ProgressDialog progressDialog = ProgressDialog.show(activity,
                // activity.getText(R.string.titleDialog), activity.getText(R.string.progressText), true, true);
                Intent intent = new Intent(activity, DestActivity.class);
                intent.putExtra("User", "Enculer");
                activity.startActivity(intent);


            }
        });

        Button buttonTest = (Button) view.findViewById(R.id.btn_test);
        buttonTest.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(activity, TestActivity.class);

                activity.startActivity(intent);
            }
        });

    }


}
