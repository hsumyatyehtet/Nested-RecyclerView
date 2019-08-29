package hmyh.dev.nestedrecyclerview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import hmyh.dev.nestedrecyclerview.R;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainHolder> {

    private Context context;
    private RecyclerView.RecycledViewPool recycledViewPool;
    private NestedAdapter nestedAdapter;

    public MainAdapter(Context context) {
        this.context = context;
        nestedAdapter = new NestedAdapter();
        recycledViewPool = new RecyclerView.RecycledViewPool();
    }

    @NonNull
    @Override
    public MainHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.nested_recycler, viewGroup, false);
        return new MainHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainHolder holder, int position) {
        holder.recyclerView.setAdapter(nestedAdapter);
        holder.recyclerView.setRecycledViewPool(recycledViewPool);
    }

    @Override
    public int getItemCount() {
        return 4;
    }


    public class MainHolder extends RecyclerView.ViewHolder {

        private RecyclerView recyclerView;
        private LinearLayoutManager linearLayoutManager;

        public MainHolder(@NonNull View itemView) {
            super(itemView);

            recyclerView = itemView.findViewById(R.id.rv_nested);
            linearLayoutManager = new LinearLayoutManager(itemView.getContext(), LinearLayoutManager.HORIZONTAL, false);
            recyclerView.setLayoutManager(linearLayoutManager);
        }
    }
}
