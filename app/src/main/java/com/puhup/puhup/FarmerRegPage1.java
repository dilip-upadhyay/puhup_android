package com.puhup.puhup;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.AppCompatButton;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.puhup.puhup.bean.Farmer;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FarmerRegPage1.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FarmerRegPage1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FarmerRegPage1 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private Button btn_register;
    private EditText et_email, et_password, your_full_name;
    private TextView tv_login;
    private ProgressBar progress;
    private Farmer farmer;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public FarmerRegPage1() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FarmerRegPage1.
     */
    // TODO: Rename and change types and number of parameters
    public static FarmerRegPage1 newInstance(String param1, String param2) {
        FarmerRegPage1 fragment = new FarmerRegPage1();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    private void initViews(View view) {

        your_full_name = (EditText) view.findViewById(R.id.your_full_name);
        et_email = (EditText) view.findViewById(R.id.your_email_address);
        et_password = (EditText) view.findViewById(R.id.create_new_password);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //String sharedStringInFragment1= ((FarmerRegistration) getActivity()).getShareString();
        View view = inflater.inflate(R.layout.fragment_farmer_reg_page1, container, false);
        btn_register = (Button) view.findViewById(R.id.singn_up); // you have to use rootview object..
        btn_register.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v)
            {
                farmer = ((FarmerRegistration) getActivity()).getFarmer();
               // farmer.setFirstName(your_full_name.toString());            }
        }});

        initViews(view);
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
