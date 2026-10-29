package d0;

import android.database.Cursor;
import android.widget.Filter;

/* compiled from: MyApplication */
class b extends Filter {

    /* renamed from: a, reason: collision with root package name */
    a f23059a;

    /* compiled from: MyApplication */
    interface a {
        void a(Cursor cursor);

        Cursor b();

        Cursor c(CharSequence charSequence);

        CharSequence convertToString(Cursor cursor);
    }

    b(a aVar) {
        this.f23059a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f23059a.convertToString((Cursor) obj);
    }

    @Override // android.widget.Filter
    protected Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor c8 = this.f23059a.c(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (c8 != null) {
            filterResults.count = c8.getCount();
            filterResults.values = c8;
            return filterResults;
        }
        filterResults.count = 0;
        filterResults.values = null;
        return filterResults;
    }

    @Override // android.widget.Filter
    protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor b8 = this.f23059a.b();
        Object obj = filterResults.values;
        if (obj == null || obj == b8) {
            return;
        }
        this.f23059a.a((Cursor) obj);
    }
}
