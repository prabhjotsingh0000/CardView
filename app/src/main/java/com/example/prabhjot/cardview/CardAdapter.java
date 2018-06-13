package com.example.prabhjot.cardview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


public class CardAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<Card> cardsList;

    public class MyViewHolder1 extends RecyclerView.ViewHolder {
        public TextView disease, drugStrength, dosage, frequency, route,duration, instructions;

        public MyViewHolder1(View view) {
            super(view);

            disease= (TextView) view.findViewById(R.id.disease);
            drugStrength= (TextView) view.findViewById(R.id.drug_strength);
            dosage= (TextView) view.findViewById(R.id.dosage);
            frequency= (TextView) view.findViewById(R.id.frequency);
            route= (TextView) view.findViewById(R.id.route);
            duration= (TextView) view.findViewById(R.id.duration);
            instructions= (TextView) view.findViewById(R.id.instructions);
        }
    }

    public class MyViewHolder2 extends RecyclerView.ViewHolder {
        public TextView disease, numberOfDoses, drugStrength, dosage, route, instructions;

        public MyViewHolder2(View view) {
            super(view);

            disease= (TextView) view.findViewById(R.id.disease);
            numberOfDoses= (TextView) view.findViewById(R.id.number_of_doses) ;
            drugStrength= (TextView) view.findViewById(R.id.drug_strength);
            dosage= (TextView) view.findViewById(R.id.dosage);
            route= (TextView) view.findViewById(R.id.route);
            instructions= (TextView) view.findViewById(R.id.instructions);
        }
    }



    public CardAdapter(List<Card> cardsList)
    {
        this.cardsList=cardsList;
    }



    @Override
    public RecyclerView.ViewHolder  onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView;

        if(viewType==0) {
            itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.card_layout, parent, false);
            return new MyViewHolder1(itemView);
        }

        else
        {
            itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.card_layout2, parent, false);
            return new MyViewHolder2(itemView);
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        int isSingle= holder.getItemViewType();
        Card card = cardsList.get(position);

        if(isSingle==0) {
            MyViewHolder1 holder1= (MyViewHolder1)holder;
            holder1.disease.setText(card.getDisease());
            holder1.drugStrength.setText(card.getDrugStrength());
            holder1.dosage.setText(card.getDosage());
            holder1.frequency.setText(card.getFrequency());
            holder1.route.setText(card.getRoute());
            holder1.duration.setText(card.getDuration());
            holder1.instructions.setText(card.getInstructions());
        }
        else
        {

            MyViewHolder2 holder2= (MyViewHolder2)holder;
            holder2.disease.setText(card.getDisease());
            holder2.numberOfDoses.setText(card.getNumberOfDoses());
            holder2.drugStrength.setText(card.getDrugStrength());
            holder2.dosage.setText(card.getDosage());
            holder2.route.setText(card.getRoute());
            holder2.instructions.setText(card.getInstructions());

        }

    }

    @Override
    public int getItemViewType(int position) {
        boolean isSingle = cardsList.get(position).getIsSingleDose();
        if(isSingle) {
            return 1;
        } else {
            return 0;
        }
    }


    @Override
    public int getItemCount() {
        return cardsList.size();
    }
}
