package t1;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.nabil.R;
import java.util.ArrayList;

public class d extends ArrayAdapter {

    private ArrayList f26350q;

    private Context f26351r;

    private Typeface f26352s;

    private static class b {

        TextView f26353a;

        TextView f26354b;

        private b() {
        }
    }

    public d(ArrayList arrayList, Context context) {
        super(context, R.layout.goal_row, arrayList);
        this.f26350q = arrayList;
        this.f26351r = context;
        this.f26352s = Typeface.createFromAsset(context.getAssets(), "bptypewrite.regular.mine.ttf");
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i7, View view, ViewGroup viewGroup) {
        View view2;
        b bVar;
        c cVar = (c) getItem(i7);
        if (view == null) {
            bVar = new b();
            view2 = LayoutInflater.from(getContext()).inflate(R.layout.goal_row, viewGroup, false);
            bVar.f26353a = (TextView) view2.findViewById(R.id.title);
            bVar.f26354b = (TextView) view2.findViewById(R.id.subtitle);
            view2.setTag(bVar);
        } else {
            view2 = view;
            bVar = (b) view.getTag();
        }
        if (cVar != null) {
            bVar.f26353a.setText(cVar.e());
            if (cVar.b() == 2) {
                bVar.f26354b.setText(cVar.c());
                bVar.f26353a.setTextColor(this.f26351r.getResources().getColor(R.color.option_text_enabled));
                bVar.f26354b.setTextColor(this.f26351r.getResources().getColor(R.color.option_text_enabled));
            } else if (cVar.b() == 1) {
                bVar.f26354b.setText(cVar.d());
                bVar.f26353a.setTextColor(this.f26351r.getResources().getColor(R.color.option_text_disabled));
                bVar.f26354b.setTextColor(this.f26351r.getResources().getColor(R.color.option_text_disabled));
            } else {
                bVar.f26354b.setText("? ? ?");
                bVar.f26353a.setTextColor(this.f26351r.getResources().getColor(R.color.option_text_disabled));
                bVar.f26354b.setTextColor(this.f26351r.getResources().getColor(R.color.option_text_disabled));
            }
        }
        bVar.f26353a.setTypeface(this.f26352s);
        bVar.f26354b.setTypeface(this.f26352s);
        return view2;
    }
}
