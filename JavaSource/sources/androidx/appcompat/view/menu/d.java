package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* compiled from: MyApplication */
public class d extends BaseAdapter {

    /* renamed from: q, reason: collision with root package name */
    e f445q;

    /* renamed from: r, reason: collision with root package name */
    private int f446r = -1;

    /* renamed from: s, reason: collision with root package name */
    private boolean f447s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f448t;

    /* renamed from: u, reason: collision with root package name */
    private final LayoutInflater f449u;

    /* renamed from: v, reason: collision with root package name */
    private final int f450v;

    public d(e eVar, LayoutInflater layoutInflater, boolean z7, int i7) {
        this.f448t = z7;
        this.f449u = layoutInflater;
        this.f445q = eVar;
        this.f450v = i7;
        a();
    }

    void a() {
        g v7 = this.f445q.v();
        if (v7 != null) {
            ArrayList z7 = this.f445q.z();
            int size = z7.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (((g) z7.get(i7)) == v7) {
                    this.f446r = i7;
                    return;
                }
            }
        }
        this.f446r = -1;
    }

    public e b() {
        return this.f445q;
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public g getItem(int i7) {
        ArrayList z7 = this.f448t ? this.f445q.z() : this.f445q.E();
        int i8 = this.f446r;
        if (i8 >= 0 && i7 >= i8) {
            i7++;
        }
        return (g) z7.get(i7);
    }

    public void d(boolean z7) {
        this.f447s = z7;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f446r < 0 ? (this.f448t ? this.f445q.z() : this.f445q.E()).size() : r0.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i7) {
        return i7;
    }

    @Override // android.widget.Adapter
    public View getView(int i7, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f449u.inflate(this.f450v, viewGroup, false);
        }
        int groupId = getItem(i7).getGroupId();
        int i8 = i7 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f445q.F() && groupId != (i8 >= 0 ? getItem(i8).getGroupId() : groupId));
        k.a aVar = (k.a) view;
        if (this.f447s) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.d(getItem(i7), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
