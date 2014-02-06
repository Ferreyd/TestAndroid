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
 * @author Nicolas
 *         Date : 06/02/14 11:20
 */
public class TestFragment extends Fragment
{
    private View view;
    private Activity activity;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        activity = super.getActivity(); //Permet de récupérer l'activité courrante
        view = inflater.inflate(R.layout.fragment_test, container, false); //Recupère la vue courante
        //String str = (String) activity.getIntent().getSerializableExtra("User");
        // ((TextView) view.findViewById(R.id.str_hello)).setText(str);
        view.findViewById(R.id.editText);
        Log.i("makemachine", "On Create View");
        // initButton();
        return view;

    }

    private void initButton()
    {
        Button button = (Button) view.findViewById(R.id.btn_biatch);
        button.setOnClickListener(new View.OnClickListener()
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
    }
}
