package com.glancelab.ptps;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class PaymentActivity extends Fragment implements AdapterView.OnItemSelectedListener {
    String[] bankNames={"BOI","SBI","HDFC","PNB","OBC"};
    Button next;
    private View view;
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        view = inflater.inflate(R.layout.activity_payment, container, false);
        next = (Button) view.findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragmentC = new PaymentActivity2();
                FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
                transaction.replace(R.id.child_fragment, fragmentC ).commit();
            }
        });
        return view;


    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("Payment");
        // Spinner element
        Spinner spinner = (Spinner) getActivity().findViewById(R.id.spinner);
        // Spinner click listener
        spinner.setOnItemSelectedListener(this);
        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add("QRT2342");
        categories.add("BTD4562");
        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getActivity(), R.layout.spinner_item, categories);
        // Drop down layout style – list view with radio button
        dataAdapter.setDropDownViewResource(R.layout.spinner_dropdown_item);
        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);

        // Spinner element
        Spinner spinner2 = (Spinner) getActivity().findViewById(R.id.spinner2);
        // Spinner click listener
        spinner2.setOnItemSelectedListener(this);
        // Spinner Drop down elements
        List<String> location = new ArrayList<String>();
        location.add("Dataran Pahlawan");
        location.add("Mahkota Parade");
        location.add("Ayer Keroh");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(getActivity(), R.layout.spinner_item, location);
        // Drop down layout style – list view with radio button
        dataAdapter2.setDropDownViewResource(R.layout.spinner_dropdown_item);
        // attaching data adapter to spinner
        spinner2.setAdapter(dataAdapter2);



    }





    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
    {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

    }

    public void onNothingSelected(AdapterView<?> arg0)
    {
        // TODO Auto-generated method stub
    }
}
