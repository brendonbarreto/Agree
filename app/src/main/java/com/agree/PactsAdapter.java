package com.agree;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by brendon.barreto on 04/05/2017.
 */

public class PactsAdapter extends RecyclerView.Adapter<PactsAdapter.PactsViewHolder> {

    private List<Pact> mList;

    PactsAdapter(List<Pact> list) {
        mList = list;
    }

    @Override
    public PactsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.pact_list_item, parent, false);
        return new PactsViewHolder(layoutView);
    }

    @Override
    public void onBindViewHolder(PactsViewHolder holder, int position) {
        Pact pact = mList.get(position);
        holder.pactName.setText(pact.getDescription());
        //holder.anotacaoData.setText(anotacao.getData());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public Pact getPact(int position) {
        return mList.get(position);
    }

    class PactsViewHolder extends RecyclerView.ViewHolder {

        public TextView pactName;

        public PactsViewHolder(View itemView) {
            super(itemView);

            pactName = (TextView) itemView.findViewById(R.id.pact_name_txt);
        }
    }

}
