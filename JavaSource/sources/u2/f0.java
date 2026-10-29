package u2;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.android.gms.internal.ads.uy;
import v2.n1;

/* compiled from: MyApplication */
public final class f0 extends FrameLayout implements View.OnClickListener {

    /* renamed from: q, reason: collision with root package name */
    private final ImageButton f26513q;

    /* renamed from: r, reason: collision with root package name */
    private final i f26514r;

    public f0(Context context, e0 e0Var, i iVar) {
        super(context);
        this.f26514r = iVar;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.f26513q = imageButton;
        c();
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        s2.z.a();
        int c8 = w2.g.c(context, e0Var.f26509a);
        s2.z.a();
        int c9 = w2.g.c(context, 0);
        s2.z.a();
        int c10 = w2.g.c(context, e0Var.f26510b);
        s2.z.a();
        imageButton.setPadding(c8, c9, c10, w2.g.c(context, e0Var.f26511c));
        imageButton.setContentDescription("Interstitial close button");
        s2.z.a();
        int c11 = w2.g.c(context, e0Var.f26512d + e0Var.f26509a + e0Var.f26510b);
        s2.z.a();
        addView(imageButton, new FrameLayout.LayoutParams(c11, w2.g.c(context, e0Var.f26512d + e0Var.f26511c), 17));
        long longValue = ((Long) s2.b0.c().d(uy.f17215u1)).longValue();
        if (longValue <= 0) {
            return;
        }
        d0 d0Var = ((Boolean) s2.b0.c().d(uy.f17223v1)).booleanValue() ? new d0(this) : null;
        imageButton.setAlpha(0.0f);
        imageButton.animate().alpha(1.0f).setDuration(longValue).setListener(d0Var);
    }

    private final void c() {
        String str = (String) s2.b0.c().d(uy.f17207t1);
        if (TextUtils.isEmpty(str) || "default".equals(str)) {
            this.f26513q.setImageResource(R.drawable.btn_dialog);
            return;
        }
        Resources h8 = r2.t.l().h();
        if (h8 == null) {
            this.f26513q.setImageResource(R.drawable.btn_dialog);
            return;
        }
        Drawable drawable = null;
        try {
            if ("white".equals(str)) {
                drawable = h8.getDrawable(p2.a.f25086b);
            } else if ("black".equals(str)) {
                drawable = h8.getDrawable(p2.a.f25085a);
            }
        } catch (Resources.NotFoundException unused) {
            int i7 = n1.f26802b;
            w2.p.a("Close button resource not found, falling back to default.");
        }
        if (drawable == null) {
            this.f26513q.setImageResource(R.drawable.btn_dialog);
            return;
        }
        ImageButton imageButton = this.f26513q;
        imageButton.setImageDrawable(drawable);
        imageButton.setScaleType(ImageView.ScaleType.CENTER);
    }

    public final void a(boolean z7) {
        if (!z7) {
            this.f26513q.setVisibility(0);
            return;
        }
        ImageButton imageButton = this.f26513q;
        imageButton.setVisibility(8);
        if (((Long) s2.b0.c().d(uy.f17215u1)).longValue() > 0) {
            imageButton.animate().cancel();
            imageButton.clearAnimation();
        }
    }

    final /* synthetic */ ImageButton b() {
        return this.f26513q;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        i iVar = this.f26514r;
        if (iVar != null) {
            iVar.h();
        }
    }
}
