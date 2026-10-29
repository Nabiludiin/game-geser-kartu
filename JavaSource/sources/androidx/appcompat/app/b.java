package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;

/* compiled from: MyApplication */
public class b extends g.g implements DialogInterface {

    /* renamed from: s, reason: collision with root package name */
    final AlertController f242s;

    /* compiled from: MyApplication */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final AlertController.b f243a;

        /* renamed from: b, reason: collision with root package name */
        private final int f244b;

        public a(Context context) {
            this(context, b.g(context, 0));
        }

        public b a() {
            b bVar = new b(this.f243a.f202a, this.f244b);
            this.f243a.a(bVar.f242s);
            bVar.setCancelable(this.f243a.f219r);
            if (this.f243a.f219r) {
                bVar.setCanceledOnTouchOutside(true);
            }
            bVar.setOnCancelListener(this.f243a.f220s);
            bVar.setOnDismissListener(this.f243a.f221t);
            DialogInterface.OnKeyListener onKeyListener = this.f243a.f222u;
            if (onKeyListener != null) {
                bVar.setOnKeyListener(onKeyListener);
            }
            return bVar;
        }

        public Context b() {
            return this.f243a.f202a;
        }

        public a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f243a;
            bVar.f224w = listAdapter;
            bVar.f225x = onClickListener;
            return this;
        }

        public a d(View view) {
            this.f243a.f208g = view;
            return this;
        }

        public a e(Drawable drawable) {
            this.f243a.f205d = drawable;
            return this;
        }

        public a f(DialogInterface.OnKeyListener onKeyListener) {
            this.f243a.f222u = onKeyListener;
            return this;
        }

        public a g(ListAdapter listAdapter, int i7, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f243a;
            bVar.f224w = listAdapter;
            bVar.f225x = onClickListener;
            bVar.I = i7;
            bVar.H = true;
            return this;
        }

        public a h(CharSequence charSequence) {
            this.f243a.f207f = charSequence;
            return this;
        }

        public a(Context context, int i7) {
            this.f243a = new AlertController.b(new ContextThemeWrapper(context, b.g(context, i7)));
            this.f244b = i7;
        }
    }

    protected b(Context context, int i7) {
        super(context, g(context, i7));
        this.f242s = new AlertController(getContext(), this, getWindow());
    }

    static int g(Context context, int i7) {
        if (((i7 >>> 24) & 255) >= 1) {
            return i7;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(f.a.f23319l, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView f() {
        return this.f242s.d();
    }

    @Override // g.g, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f242s.e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (this.f242s.f(i7, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i7, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i7, KeyEvent keyEvent) {
        if (this.f242s.g(i7, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i7, keyEvent);
    }

    @Override // g.g, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f242s.p(charSequence);
    }
}
