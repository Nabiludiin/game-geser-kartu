package d0;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: MyApplication */
public abstract class c extends a {
    private LayoutInflater A;

    /* renamed from: y, reason: collision with root package name */
    private int f23060y;

    /* renamed from: z, reason: collision with root package name */
    private int f23061z;

    public c(Context context, int i7, Cursor cursor, boolean z7) {
        super(context, cursor, z7);
        this.f23061z = i7;
        this.f23060y = i7;
        this.A = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // d0.a
    public View f(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.A.inflate(this.f23061z, viewGroup, false);
    }

    @Override // d0.a
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.A.inflate(this.f23060y, viewGroup, false);
    }
}
