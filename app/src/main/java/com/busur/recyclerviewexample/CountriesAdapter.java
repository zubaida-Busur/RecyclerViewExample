package com.busur.recyclerviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


//step 1 : create your adapter class
//step 4: extend Recyclerview.Adapter<YourViewHolderClass>
//step 5: solve the error (imlement methods)
public class CountriesAdapter extends  RecyclerView.Adapter<CountriesAdapter.ViewHolder>{

    //step 6
    //Declare all the variables needed by the view holder class
    // LayoutInflater, Context and List


    LayoutInflater mInflater;
    Context context;
    ArrayList<Countries> countries;

    //Step 7: initialize the variables in the constructor
    public CountriesAdapter(Context context, ArrayList<Countries> coutriesList) {

        mInflater = LayoutInflater.from(context);
        this.context  = context;
        this.countries = coutriesList;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //step 8: bind your Layout
        View mItemView = mInflater.inflate(R.layout.countries_viewholder, parent, false);
        return new ViewHolder(mItemView, this);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        //step 9 : tell us your data in each cell
        //onclicks

        holder.cityName.setText(countries.get(position).getCityName());
        holder.countryName.setText(countries.get(position).getCountryName());

    }

    @Override
    public int getItemCount() {
        //step 10 : return your list size
        return countries.size();
    }

    
    //step 2 : create a static inner class and extends RecylerView.ViewHolder
    //there will be an error: click the red ballon to solve the problem (contructor matching super)
    //step 3: bind views
    public static class ViewHolder extends RecyclerView.ViewHolder
    {

        ImageView capitalImage;
        TextView countryName, cityName;

        public ViewHolder(@NonNull View itemView, CountriesAdapter countriesAdapter) {
            super(itemView);

            capitalImage = itemView.findViewById(R.id.imageView);
            countryName = itemView.findViewById(R.id.tv_country_name);
            cityName = itemView.findViewById(R.id.tv_capital_city);

        }
    }
}
