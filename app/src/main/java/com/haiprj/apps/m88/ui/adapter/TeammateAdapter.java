package com.haiprj.apps.m88.ui.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.haiprj.apps.m88.R;
import com.haiprj.apps.m88.databinding.ItemMemberBinding;
import com.haiprj.apps.m88.model.TeammateModel;

import java.util.ArrayList;
import java.util.List;

public class TeammateAdapter extends RecyclerView.Adapter<TeammateAdapter.TeammateHolder> {
    private final Context context;
    private final List<TeammateModel> list = new ArrayList<>();

    public TeammateAdapter(Context context) {
        this.context = context;
    }

    @SuppressLint("NotifyDataSetChanged")
    public void update(List<TeammateModel> list) {
        this.list.clear();
        this.list.addAll(list);
        notifyDataSetChanged();
    }
    /**
     * Called when RecyclerView needs a new {@link ViewHolder} of the given type to represent
     * an item.
     * <p>
     * This new ViewHolder should be constructed with a new View that can represent the items
     * of the given type. You can either create a new View manually or inflate it from an XML
     * layout file.
     * <p>
     * The new ViewHolder will be used to display items of the adapter using
     * {@link #onBindViewHolder(ViewHolder, int, List)}. Since it will be re-used to display
     * different items in the data set, it is a good idea to cache references to sub views of
     * the View to avoid unnecessary {@link View#findViewById(int)} calls.
     *
     * @param parent   The ViewGroup into which the new View will be added after it is bound to
     *                 an adapter position.
     * @param viewType The view type of the new View.
     * @return A new ViewHolder that holds a View of the given view type.
     * @see #getItemViewType(int)
     * @see #onBindViewHolder(ViewHolder, int)
     */
    @NonNull
    @Override
    public TeammateHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TeammateHolder(LayoutInflater.from(this.context).inflate(R.layout.item_member, parent, false));
    }

    /**
     * Called by RecyclerView to display the data at the specified position. This method should
     * update the contents of the {@link ViewHolder#itemView} to reflect the item at the given
     * position.
     * <p>
     * Note that unlike {@link ListView}, RecyclerView will not call this method
     * again if the position of the item changes in the data set unless the item itself is
     * invalidated or the new position cannot be determined. For this reason, you should only
     * use the <code>position</code> parameter while acquiring the related data item inside
     * this method and should not keep a copy of it. If you need the position of an item later
     * on (e.g. in a click listener), use {@link ViewHolder#getAdapterPosition()} which will
     * have the updated adapter position.
     * <p>
     * Override {@link #onBindViewHolder(ViewHolder, int, List)} instead if Adapter can
     * handle efficient partial bind.
     *
     * @param holder   The ViewHolder which should be updated to represent the contents of the
     *                 item at the given position in the data set.
     * @param position The position of the item within the adapter's data set.
     */
    @Override
    public void onBindViewHolder(@NonNull TeammateHolder holder, int position) {
        holder.load(list.get(position));
    }

    /**
     * Returns the total number of items in the data set held by the adapter.
     *
     * @return The total number of items in this adapter.
     */
    @Override
    public int getItemCount() {
        return list.size();
    }

    public class TeammateHolder extends RecyclerView.ViewHolder{
        private ItemMemberBinding binding;
        public TeammateHolder(@NonNull View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
        }

        @SuppressLint("SetTextI18n")
        public void load(TeammateModel model){
            if ((getPosition() + 1) % 2 != 0) {
                binding.itemLayout.setBackgroundColor(context.getColor(R.color.colorFFC690));
            }
            else binding.itemLayout.setBackgroundColor(context.getColor(R.color.white));
            binding.number.setText(getPosition() + 1 + ".");
            binding.name.setText(model.getFullName() + "(" + model.getCountry() + "," + model.getBirthYear() + ")");
        }
    }
}
