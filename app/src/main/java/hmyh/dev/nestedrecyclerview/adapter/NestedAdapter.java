package hmyh.dev.nestedrecyclerview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import hmyh.dev.nestedrecyclerview.R;

public class NestedAdapter extends RecyclerView.Adapter<NestedAdapter.NestedHolder> {


    @NonNull
    @Override
    public NestedHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.nested_recyclerview_item, viewGroup, false);
        return new NestedHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NestedHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class NestedHolder extends RecyclerView.ViewHolder {

        public NestedHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
