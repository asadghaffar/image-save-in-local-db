package asad.sample.com.imagesave;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;


public class ImageListAdapter extends BaseAdapter {

    private Context context;
    private  int layout;
    private ArrayList<Modal> imgList;

    public ImageListAdapter(Context context, int layout, ArrayList<Modal> imgList2) {
        this.context = context;
        this.layout = layout;
        this.imgList = imgList2;
    }

    @Override
    public int getCount() {
        return imgList.size();
    }

    @Override
    public Object getItem(int position) {
        return imgList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    private class ViewHolder{
        ImageView imageView;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        View row = view;
        ViewHolder holder = new ViewHolder();

        if(row == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(layout, null);

            holder.imageView = (ImageView) row.findViewById(R.id.imgShow);
            row.setTag(holder);
        }
        else {
            holder = (ViewHolder) row.getTag();
        }

        Modal modal = imgList.get(position);


        byte[] imgeByte = modal.getImage();
        Bitmap bitmap = BitmapFactory.decodeByteArray(imgeByte, 0, imgeByte.length);
        holder.imageView.setImageBitmap(bitmap);

        return row;
    }
}
