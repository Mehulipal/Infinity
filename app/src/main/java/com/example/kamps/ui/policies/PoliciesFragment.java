package com.example.kamps.ui.policies;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kamps.R;

import java.util.ArrayList;
import java.util.List;

public class PoliciesFragment extends Fragment {

    public PoliciesFragment() {
    }

    private PoliciesAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_policies, container, false);
        Log.e(".PoliciesFragment","Worked fine before");
        RecyclerView recyclerView = view.findViewById(R.id.recycler_policies);
        Log.e(".PoliciesFragment","Worked now??????????????????????");

        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 1));

        adapter = new PoliciesAdapter(getContext());
        recyclerView.setAdapter(adapter);

        populateData();

        return view;
    }

    private void populateData() {

        ArrayList<PoliciesClass> PolicyItems = new ArrayList<>();
        PolicyItems.add(new PoliciesClass("Policy Name 1","Policy Description 1",R.drawable.ic_launcher_foreground,"Visit US 1"));
        PolicyItems.add(new PoliciesClass("Policy Name 2","Policy Description 2",R.drawable.ic_launcher_foreground,"Visit US 2"));
        PolicyItems.add(new PoliciesClass("Policy Name 3","Policy Description 3",R.drawable.ic_launcher_foreground,"Visit US 3"));
        PolicyItems.add(new PoliciesClass("Policy Name 4","Policy Description 4",R.drawable.ic_launcher_foreground,"Visit US 4"));
        PolicyItems.add(new PoliciesClass("Policy Name 5","Policy Description 5",R.drawable.ic_launcher_foreground,"Visit US 5"));
        PolicyItems.add(new PoliciesClass("Policy Name 6","Policy Description 6",R.drawable.ic_launcher_foreground,"Visit US 6"));

        adapter.setPoliciesAdapter(PolicyItems);

    }

}