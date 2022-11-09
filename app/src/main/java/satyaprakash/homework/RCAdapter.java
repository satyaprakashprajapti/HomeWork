package satyaprakash.homework;

import android.icu.text.Transliterator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RCAdapter extends RecyclerView.Adapter<RCAdapter.ViewHolder> {
private  Model[] list;
    public RCAdapter(Model[] list) {
        this.list = list;
    }


    @NonNull
    @Override
    public RCAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.recycler_view,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RCAdapter.ViewHolder holder, int position) {
        final  Model model=list[position];
        holder.imageView.setImageResource(list[position].getImgIg());
    }

    @Override
    public int getItemCount() {
        return list.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
public ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.imageView=(ImageView)itemView.findViewById(R.id.profile);
        }
    }
}
