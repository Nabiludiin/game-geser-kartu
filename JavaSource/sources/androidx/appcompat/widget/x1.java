package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;

/* compiled from: MyApplication */
class x1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f932a;

    /* renamed from: b, reason: collision with root package name */
    private final View f933b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f934c;

    /* renamed from: d, reason: collision with root package name */
    private final WindowManager.LayoutParams f935d;

    /* renamed from: e, reason: collision with root package name */
    private final Rect f936e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f937f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f938g;

    x1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f935d = layoutParams;
        this.f936e = new Rect();
        this.f937f = new int[2];
        this.f938g = new int[2];
        this.f932a = context;
        View inflate = LayoutInflater.from(context).inflate(f.g.f23426s, (ViewGroup) null);
        this.f933b = inflate;
        this.f934c = (TextView) inflate.findViewById(f.f.f23400s);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = f.i.f23440a;
        layoutParams.flags = 24;
    }

    private void a(View view, int i7, int i8, boolean z7, WindowManager.LayoutParams layoutParams) {
        int height;
        int i9;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f932a.getResources().getDimensionPixelOffset(f.d.f23353k);
        if (view.getWidth() < dimensionPixelOffset) {
            i7 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f932a.getResources().getDimensionPixelOffset(f.d.f23352j);
            height = i8 + dimensionPixelOffset2;
            i9 = i8 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i9 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f932a.getResources().getDimensionPixelOffset(z7 ? f.d.f23355m : f.d.f23354l);
        View b8 = b(view);
        if (b8 == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        b8.getWindowVisibleDisplayFrame(this.f936e);
        Rect rect = this.f936e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f932a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f936e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        b8.getLocationOnScreen(this.f938g);
        view.getLocationOnScreen(this.f937f);
        int[] iArr = this.f937f;
        int i10 = iArr[0];
        int[] iArr2 = this.f938g;
        int i11 = i10 - iArr2[0];
        iArr[0] = i11;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i11 + i7) - (b8.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f933b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f933b.getMeasuredHeight();
        int i12 = this.f937f[1];
        int i13 = ((i9 + i12) - dimensionPixelOffset3) - measuredHeight;
        int i14 = i12 + height + dimensionPixelOffset3;
        if (z7) {
            if (i13 >= 0) {
                layoutParams.y = i13;
                return;
            } else {
                layoutParams.y = i14;
                return;
            }
        }
        if (measuredHeight + i14 <= this.f936e.height()) {
            layoutParams.y = i14;
        } else {
            layoutParams.y = i13;
        }
    }

    private static View b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if (!(layoutParams instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams).type != 2) {
            for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof Activity) {
                    return ((Activity) context).getWindow().getDecorView();
                }
            }
        }
        return rootView;
    }

    void c() {
        if (d()) {
            ((WindowManager) this.f932a.getSystemService("window")).removeView(this.f933b);
        }
    }

    boolean d() {
        return this.f933b.getParent() != null;
    }

    void e(View view, int i7, int i8, boolean z7, CharSequence charSequence) {
        if (d()) {
            c();
        }
        this.f934c.setText(charSequence);
        a(view, i7, i8, z7, this.f935d);
        ((WindowManager) this.f932a.getSystemService("window")).addView(this.f933b, this.f935d);
    }
}
