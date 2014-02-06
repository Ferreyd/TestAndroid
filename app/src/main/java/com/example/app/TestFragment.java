package com.example.app;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * @author Nicolas
 *         Date : 06/02/14 11:20
 */
public class TestFragment extends Fragment
{
    private View view;
    private Activity activity;
    EditText editText;
    TextView textView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        activity = super.getActivity(); //Permet de récupérer l'activité courrante
        view = inflater.inflate(R.layout.fragment_test, container, false); //Recupère la vue courante
        //String str = (String) activity.getIntent().getSerializableExtra("User");
        textView = (TextView) view.findViewById(R.id.text_test);
        editText = (EditText) view.findViewById(R.id.editText);
        Log.i("makemachine", "On Create View");
        initButton();
        return view;

    }

    private void initButton()
    {
        Button button = (Button) view.findViewById(R.id.btn_editText);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if(view.getId() == R.id.btn_editText)
                {
                    String str = editText.getText().toString();
                    Log.i("makemachine", str);
                    textView.setText(str);

                }
            }
        });
    }
}
