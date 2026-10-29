package u2;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import java.util.Objects;
import v2.f2;

/* compiled from: MyApplication */
final class v extends v2.b0 {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ a0 f26547c;

    /* synthetic */ v(a0 a0Var, byte[] bArr) {
        Objects.requireNonNull(a0Var);
        this.f26547c = a0Var;
    }

    @Override // v2.b0
    public final void a() {
        final BitmapDrawable bitmapDrawable;
        a0 a0Var = this.f26547c;
        Bitmap a8 = r2.t.C().a(Integer.valueOf(a0Var.f26490r.E.f25816v));
        if (a8 != null) {
            r2.t.g();
            r2.l lVar = a0Var.f26490r.E;
            boolean z7 = lVar.f25814t;
            float f8 = lVar.f25815u;
            Activity activity = a0Var.f26489q;
            if (!z7 || f8 <= 0.0f || f8 > 25.0f) {
                bitmapDrawable = new BitmapDrawable(activity.getResources(), a8);
            } else {
                try {
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(a8, a8.getWidth(), a8.getHeight(), false);
                    Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
                    RenderScript create = RenderScript.create(activity);
                    ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
                    Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
                    Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
                    create2.setRadius(f8);
                    create2.setInput(createFromBitmap);
                    create2.forEach(createFromBitmap2);
                    createFromBitmap2.copyTo(createBitmap);
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), createBitmap);
                } catch (RuntimeException unused) {
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), a8);
                }
            }
            f2.f26746l.post(new Runnable() { // from class: u2.u
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    v.this.f26547c.f26489q.getWindow().setBackgroundDrawable(bitmapDrawable);
                }
            });
        }
    }
}
