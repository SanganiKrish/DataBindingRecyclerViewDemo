package view;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.databindingrecyclerviewdemo.databinding.SingleRowBinding;

import java.util.List;

import model.Model;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    List<Model> userList;
    public MyAdapter(List<Model> userList) {
        this.userList = userList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        SingleRowBinding singleRowBinding = SingleRowBinding.inflate(layoutInflater, parent, false);
        return new MyViewHolder(singleRowBinding);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        final Model model = userList.get(position);
        holder.singleRowBinding.setUser(model);

        holder.singleRowBinding.executePendingBindings();//--------------------------------------------------------//

    }

    @Override
    public int getItemCount() {
        return userList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {

        SingleRowBinding singleRowBinding;

        public MyViewHolder(@NonNull SingleRowBinding singleRowBinding) {
            super(singleRowBinding.getRoot());
            this.singleRowBinding = singleRowBinding;
        }
    }
}
