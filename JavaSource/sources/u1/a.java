package u1;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import c6.t;
import com.nabil.R;
import java.util.List;
import t1.g;

/* compiled from: MyApplication */
public class a extends BaseAdapter {

    /* renamed from: q, reason: collision with root package name */
    private List f26485q;

    /* renamed from: r, reason: collision with root package name */
    private Context f26486r;

    /* renamed from: s, reason: collision with root package name */
    private TextView f26487s;

    /* compiled from: MyApplication */
    /* renamed from: u1.a$a, reason: collision with other inner class name */
    class ViewOnClickListenerC0136a implements View.OnClickListener {
        ViewOnClickListenerC0136a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Log.i("Layer type: ", Integer.toString(view.getLayerType()));
            Log.i("Hardware Accel type:", Integer.toString(2));
        }
    }

    public a(List list, Context context) {
        this.f26485q = list;
        this.f26486r = context;
        this.f26487s = (TextView) ((Activity) context).findViewById(R.id.character_text);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f26485q.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i7) {
        return this.f26485q.get(i7);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i7) {
        return i7;
    }

    @Override // android.widget.Adapter
    public View getView(int i7, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = ((LayoutInflater) this.f26486r.getSystemService("layout_inflater")).inflate(R.layout.test_card2, viewGroup, false);
        }
        g gVar = (g) this.f26485q.get(i7);
        if (gVar == null) {
            gVar = new g(-404, R.string.empty_string, R.string.error_card_404_title, R.drawable.event_text_card, R.string.error_card_404_desc, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
        }
        TextView textView = (TextView) view.findViewById(R.id.left_image);
        TextView textView2 = (TextView) view.findViewById(R.id.right_image);
        t.n(this.f26486r).i(gVar.f()).c().a().e((ImageView) view.findViewById(R.id.offer_image));
        Typeface createFromAsset = Typeface.createFromAsset(this.f26486r.getAssets(), "bptypewrite.regular.mine.ttf");
        this.f26487s.setText(this.f26486r.getResources().getString(gVar.a()));
        TextView textView3 = (TextView) view.findViewById(R.id.event_card_text);
        ImageView imageView = (ImageView) view.findViewById(R.id.card_effect_symbol);
        TextView textView4 = (TextView) view.findViewById(R.id.card_effect_title);
        TextView textView5 = (TextView) view.findViewById(R.id.card_effect_description);
        textView2.setText(this.f26486r.getResources().getString(gVar.i()));
        textView.setText(this.f26486r.getResources().getString(gVar.g()));
        if (gVar.e() != 0) {
            textView3.setText(this.f26486r.getResources().getString(gVar.e()));
        }
        if (gVar.c() != 0) {
            imageView.setImageResource(gVar.c());
            textView4.setText(this.f26486r.getResources().getString(gVar.d()));
            textView5.setText(this.f26486r.getResources().getString(gVar.b()));
        }
        textView.setTypeface(createFromAsset);
        textView2.setTypeface(createFromAsset);
        textView3.setTypeface(createFromAsset);
        textView4.setTypeface(createFromAsset);
        textView5.setTypeface(createFromAsset);
        ((TextView) ((Activity) this.f26486r).findViewById(R.id.main_text)).setText(this.f26486r.getResources().getString(gVar.k()));
        System.out.println("Current card: " + i7);
        view.setOnClickListener(new ViewOnClickListenerC0136a());
        return view;
    }
}
