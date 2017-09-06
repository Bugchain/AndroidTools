package app.bugchain.tools;
/*
 * Created by BUG CHAIN on 06/09/2017.
 * ARIP Public Company Limited
 * Bangkok, Thailand
 */

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class PreLoadAdapter extends RecyclerView.Adapter<PreLoadAdapter.PreLoadViewHolder>{

    @Override
    public PreLoadViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(PreLoadViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 1;
    }

    static class PreLoadViewHolder extends RecyclerView.ViewHolder{
        public PreLoadViewHolder(View itemView) {
            super(itemView);
        }
    }
}
