package d0;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import d0.b;

/* compiled from: MyApplication */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: q, reason: collision with root package name */
    protected boolean f23049q;

    /* renamed from: r, reason: collision with root package name */
    protected boolean f23050r;

    /* renamed from: s, reason: collision with root package name */
    protected Cursor f23051s;

    /* renamed from: t, reason: collision with root package name */
    protected Context f23052t;

    /* renamed from: u, reason: collision with root package name */
    protected int f23053u;

    /* renamed from: v, reason: collision with root package name */
    protected C0081a f23054v;

    /* renamed from: w, reason: collision with root package name */
    protected DataSetObserver f23055w;

    /* renamed from: x, reason: collision with root package name */
    protected d0.b f23056x;

    /* compiled from: MyApplication */
    /* renamed from: d0.a$a, reason: collision with other inner class name */
    private class C0081a extends ContentObserver {
        C0081a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z7) {
            a.this.j();
        }
    }

    /* compiled from: MyApplication */
    private class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f23049q = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f23049q = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z7) {
        e(context, cursor, z7 ? 1 : 2);
    }

    public void a(Cursor cursor) {
        Cursor n7 = n(cursor);
        if (n7 != null) {
            n7.close();
        }
    }

    @Override // d0.b.a
    public Cursor b() {
        return this.f23051s;
    }

    public abstract CharSequence convertToString(Cursor cursor);

    public abstract void d(View view, Context context, Cursor cursor);

    void e(Context context, Cursor cursor, int i7) {
        if ((i7 & 1) == 1) {
            i7 |= 2;
            this.f23050r = true;
        } else {
            this.f23050r = false;
        }
        boolean z7 = cursor != null;
        this.f23051s = cursor;
        this.f23049q = z7;
        this.f23052t = context;
        this.f23053u = z7 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i7 & 2) == 2) {
            this.f23054v = new C0081a();
            this.f23055w = new b();
        } else {
            this.f23054v = null;
            this.f23055w = null;
        }
        if (z7) {
            C0081a c0081a = this.f23054v;
            if (c0081a != null) {
                cursor.registerContentObserver(c0081a);
            }
            DataSetObserver dataSetObserver = this.f23055w;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View f(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f23049q || (cursor = this.f23051s) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i7, View view, ViewGroup viewGroup) {
        if (!this.f23049q) {
            return null;
        }
        this.f23051s.moveToPosition(i7);
        if (view == null) {
            view = f(this.f23052t, this.f23051s, viewGroup);
        }
        d(view, this.f23052t, this.f23051s);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f23056x == null) {
            this.f23056x = new d0.b(this);
        }
        return this.f23056x;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i7) {
        Cursor cursor;
        if (!this.f23049q || (cursor = this.f23051s) == null) {
            return null;
        }
        cursor.moveToPosition(i7);
        return this.f23051s;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i7) {
        Cursor cursor;
        if (this.f23049q && (cursor = this.f23051s) != null && cursor.moveToPosition(i7)) {
            return this.f23051s.getLong(this.f23053u);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i7, View view, ViewGroup viewGroup) {
        if (!this.f23049q) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f23051s.moveToPosition(i7)) {
            if (view == null) {
                view = h(this.f23052t, this.f23051s, viewGroup);
            }
            d(view, this.f23052t, this.f23051s);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i7);
    }

    public abstract View h(Context context, Cursor cursor, ViewGroup viewGroup);

    protected void j() {
        Cursor cursor;
        if (!this.f23050r || (cursor = this.f23051s) == null || cursor.isClosed()) {
            return;
        }
        this.f23049q = this.f23051s.requery();
    }

    public Cursor n(Cursor cursor) {
        Cursor cursor2 = this.f23051s;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0081a c0081a = this.f23054v;
            if (c0081a != null) {
                cursor2.unregisterContentObserver(c0081a);
            }
            DataSetObserver dataSetObserver = this.f23055w;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f23051s = cursor;
        if (cursor == null) {
            this.f23053u = -1;
            this.f23049q = false;
            notifyDataSetInvalidated();
            return cursor2;
        }
        C0081a c0081a2 = this.f23054v;
        if (c0081a2 != null) {
            cursor.registerContentObserver(c0081a2);
        }
        DataSetObserver dataSetObserver2 = this.f23055w;
        if (dataSetObserver2 != null) {
            cursor.registerDataSetObserver(dataSetObserver2);
        }
        this.f23053u = cursor.getColumnIndexOrThrow("_id");
        this.f23049q = true;
        notifyDataSetChanged();
        return cursor2;
    }
}
