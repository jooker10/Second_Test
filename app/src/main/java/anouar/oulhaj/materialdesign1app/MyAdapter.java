package anouar.oulhaj.materialdesign1app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {
    private  onRecyclerItemClickListener listener;
    private ArrayList<Name> names;

    public MyAdapter(ArrayList<Name> names,onRecyclerItemClickListener listener){
        this.names = names;
        this.listener = listener;
    }


    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_rv_model,parent,false);
        MyHolder holder = new MyHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        Name name = names.get(position);
        holder.bind(name);

    }

    @Override
    public int getItemCount() {
        return names.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        TextView tv_name;
        Name name;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            tv_name = itemView.findViewById(R.id.model_tv_name);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.RecyclerItemClick(tv_name.getText().toString());
                }
            });

        }
        void bind(Name name){
            this.name = name;
            tv_name.setText(name.getName());
        }
    }
}
