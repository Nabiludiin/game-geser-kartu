package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* compiled from: MyApplication */
public class c implements j, AdapterView.OnItemClickListener {

    /* renamed from: q, reason: collision with root package name */
    Context f434q;

    /* renamed from: r, reason: collision with root package name */
    LayoutInflater f435r;

    /* renamed from: s, reason: collision with root package name */
    e f436s;

    /* renamed from: t, reason: collision with root package name */
    ExpandedMenuView f437t;

    /* renamed from: u, reason: collision with root package name */
    int f438u;

    /* renamed from: v, reason: collision with root package name */
    int f439v;

    /* renamed from: w, reason: collision with root package name */
    int f440w;

    /* renamed from: x, reason: collision with root package name */
    private j.a f441x;

    /* renamed from: y, reason: collision with root package name */
    a f442y;

    /* compiled from: MyApplication */
    private class a extends BaseAdapter {

        /* renamed from: q, reason: collision with root package name */
        private int f443q = -1;

        public a() {
            a();
        }

        void a() {
            g v7 = c.this.f436s.v();
            if (v7 != null) {
                ArrayList z7 = c.this.f436s.z();
                int size = z7.size();
                for (int i7 = 0; i7 < size; i7++) {
                    if (((g) z7.get(i7)) == v7) {
                        this.f443q = i7;
                        return;
                    }
                }
            }
            this.f443q = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g getItem(int i7) {
            ArrayList z7 = c.this.f436s.z();
            int i8 = i7 + c.this.f438u;
            int i9 = this.f443q;
            if (i9 >= 0 && i8 >= i9) {
                i8++;
            }
            return (g) z7.get(i8);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = c.this.f436s.z().size() - c.this.f438u;
            return this.f443q < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i7) {
            return i7;
        }

        @Override // android.widget.Adapter
        public View getView(int i7, View view, ViewGroup viewGroup) {
            if (view == null) {
                c cVar = c.this;
                view = cVar.f435r.inflate(cVar.f440w, viewGroup, false);
            }
            ((k.a) view).d(getItem(i7), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public c(Context context, int i7) {
        this(i7, 0);
        this.f434q = context;
        this.f435r = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.f442y == null) {
            this.f442y = new a();
        }
        return this.f442y;
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(e eVar, boolean z7) {
        j.a aVar = this.f441x;
        if (aVar != null) {
            aVar.b(eVar, z7);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void c(boolean z7) {
        a aVar = this.f442y;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean e(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean f(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void g(j.a aVar) {
        this.f441x = aVar;
    }

    public k h(ViewGroup viewGroup) {
        if (this.f437t == null) {
            this.f437t = (ExpandedMenuView) this.f435r.inflate(f.g.f23414g, viewGroup, false);
            if (this.f442y == null) {
                this.f442y = new a();
            }
            this.f437t.setAdapter((ListAdapter) this.f442y);
            this.f437t.setOnItemClickListener(this);
        }
        return this.f437t;
    }

    @Override // androidx.appcompat.view.menu.j
    public void i(Context context, e eVar) {
        if (this.f439v != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f439v);
            this.f434q = contextThemeWrapper;
            this.f435r = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f434q != null) {
            this.f434q = context;
            if (this.f435r == null) {
                this.f435r = LayoutInflater.from(context);
            }
        }
        this.f436s = eVar;
        a aVar = this.f442y;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean k(m mVar) {
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        new f(mVar).d(null);
        j.a aVar = this.f441x;
        if (aVar == null) {
            return true;
        }
        aVar.c(mVar);
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i7, long j7) {
        this.f436s.M(this.f442y.getItem(i7), this, 0);
    }

    public c(int i7, int i8) {
        this.f440w = i7;
        this.f439v = i8;
    }
}
