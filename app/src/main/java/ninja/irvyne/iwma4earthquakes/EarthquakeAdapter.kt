package ninja.irvyne.iwma4earthquakes

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import ninja.irvyne.iwma4earthquakes.api.model.Feature

class EarthquakeAdapter(private val myDataset: ArrayList<Feature>) :
        RecyclerView.Adapter<EarthquakeAdapter.ViewHolder>() {

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder.
    // Each data item is just a string in this case that is shown in a TextView.
    inner class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EarthquakeAdapter.ViewHolder {
        // create a new view
        val textView = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_earthquake, parent, false) as TextView
        // set the view's size, margins, paddings and layout parameters

        return ViewHolder(textView)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val feature = myDataset[position]

        holder.textView.text = feature.properties?.place
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = myDataset.size
}