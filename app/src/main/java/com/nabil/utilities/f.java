package com.nabil.utilities;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.ClipDrawable;
import android.os.Handler;
import android.widget.ImageView;
import com.nabil.R;

public class f {

    private Activity f4278a;

    private ClipDrawable[] f4279b = new ClipDrawable[4];

    private int[] f4280c = {0, 0, 0, 0};

    private int[] f4281d = {0, 0, 0, 0};

    private int[] f4282e = {0, 0, 0, 0};

    private Handler[] f4284g = {new Handler(), new Handler(), new Handler(), new Handler()};

    private Runnable[] f4285h = {new b(), new c(), new d(), new e()};

    private Handler[] f4286i = {new Handler(), new Handler(), new Handler(), new Handler()};

    private Runnable[] f4287j = {new RunnableC0077f(), new g(), new h(), new i()};

    private int f4283f = R.color.stats_full;

    class a implements ValueAnimator.AnimatorUpdateListener {

        final float[] f4288a;

        final float[] f4289b;

        final float[] f4290c;

        final ClipDrawable f4291d;

        a(float[] fArr, float[] fArr2, float[] fArr3, ClipDrawable clipDrawable) {
            this.f4288a = fArr;
            this.f4289b = fArr2;
            this.f4290c = fArr3;
            this.f4291d = clipDrawable;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float[] fArr = this.f4288a;
            float f8 = this.f4289b[0];
            fArr[0] = f8 + ((this.f4290c[0] - f8) * valueAnimator.getAnimatedFraction());
            float[] fArr2 = this.f4288a;
            float f9 = this.f4289b[1];
            fArr2[1] = f9 + ((this.f4290c[1] - f9) * valueAnimator.getAnimatedFraction());
            float[] fArr3 = this.f4288a;
            float f10 = this.f4289b[2];
            fArr3[2] = f10 + ((this.f4290c[2] - f10) * valueAnimator.getAnimatedFraction());
            this.f4291d.setColorFilter(Color.HSVToColor(this.f4288a), PorterDuff.Mode.SRC_IN);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = f.this;
            fVar.q(fVar.f4281d[0], f.this.f4282e[0]);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = f.this;
            fVar.r(fVar.f4281d[1], f.this.f4282e[1]);
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = f.this;
            fVar.s(fVar.f4281d[2], f.this.f4282e[2]);
        }
    }

    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = f.this;
            fVar.t(fVar.f4281d[3], f.this.f4282e[3]);
        }
    }


    class RunnableC0077f implements Runnable {
        RunnableC0077f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = f.this;
            fVar.m(fVar.f4281d[0], f.this.f4282e[0]);
        }
    }

    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = f.this;
            fVar.n(fVar.f4281d[1], f.this.f4282e[1]);
        }
    }

    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = f.this;
            fVar.o(fVar.f4281d[2], f.this.f4282e[2]);
        }
    }

    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = f.this;
            fVar.p(fVar.f4281d[3], f.this.f4282e[3]);
        }
    }

    class j implements ValueAnimator.AnimatorUpdateListener {

        final float[] f4301a;

        final float[] f4302b;

        final float[] f4303c;

        final ClipDrawable f4304d;

        j(float[] fArr, float[] fArr2, float[] fArr3, ClipDrawable clipDrawable) {
            this.f4301a = fArr;
            this.f4302b = fArr2;
            this.f4303c = fArr3;
            this.f4304d = clipDrawable;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float[] fArr = this.f4301a;
            float f8 = this.f4302b[0];
            fArr[0] = f8 + ((this.f4303c[0] - f8) * valueAnimator.getAnimatedFraction());
            float[] fArr2 = this.f4301a;
            float f9 = this.f4302b[1];
            fArr2[1] = f9 + ((this.f4303c[1] - f9) * valueAnimator.getAnimatedFraction());
            float[] fArr3 = this.f4301a;
            float f10 = this.f4302b[2];
            fArr3[2] = f10 + ((this.f4303c[2] - f10) * valueAnimator.getAnimatedFraction());
            this.f4304d.setColorFilter(Color.HSVToColor(this.f4301a), PorterDuff.Mode.SRC_IN);
        }
    }

    public f(Activity activity) {
        this.f4278a = activity;
        this.f4279b[0] = (ClipDrawable) ((ImageView) activity.findViewById(R.id.imageFull1)).getDrawable();
        this.f4279b[0].setLevel(0);
        this.f4279b[1] = (ClipDrawable) ((ImageView) activity.findViewById(R.id.imageFull2)).getDrawable();
        this.f4279b[1].setLevel(0);
        this.f4279b[2] = (ClipDrawable) ((ImageView) activity.findViewById(R.id.imageFull3)).getDrawable();
        this.f4279b[2].setLevel(0);
        this.f4279b[3] = (ClipDrawable) ((ImageView) activity.findViewById(R.id.imageFull4)).getDrawable();
        this.f4279b[3].setLevel(0);
    }

    private void k(ClipDrawable clipDrawable) {
        float[] fArr = new float[3];
        float[] fArr2 = new float[3];
        Color.colorToHSV(this.f4278a.getResources().getColor(R.color.green), fArr);
        Color.colorToHSV(this.f4278a.getResources().getColor(this.f4283f), fArr2);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(1000L);
        ofFloat.addUpdateListener(new j(new float[3], fArr, fArr2, clipDrawable));
        ofFloat.start();
    }

    private void l(ClipDrawable clipDrawable) {
        float[] fArr = new float[3];
        float[] fArr2 = new float[3];
        Color.colorToHSV(this.f4278a.getResources().getColor(R.color.red), fArr);
        Color.colorToHSV(this.f4278a.getResources().getColor(this.f4283f), fArr2);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(1000L);
        ofFloat.addUpdateListener(new a(new float[3], fArr, fArr2, clipDrawable));
        ofFloat.start();
    }

    public void m(int i7, int i8) {
        int[] iArr = this.f4280c;
        int i9 = iArr[0];
        if (i9 == i8) {
            l(this.f4279b[0]);
            return;
        }
        int i10 = i9 - 100;
        iArr[0] = i10;
        this.f4279b[0].setLevel(i10);
        this.f4279b[0].mutate().setColorFilter(this.f4278a.getResources().getColor(R.color.red), PorterDuff.Mode.SRC_IN);
        if (this.f4280c[0] >= i8) {
            this.f4286i[0].postDelayed(this.f4287j[0], 40L);
        } else {
            this.f4286i[0].removeCallbacks(this.f4287j[0]);
            this.f4281d[0] = i8;
        }
    }

    public void n(int i7, int i8) {
        int[] iArr = this.f4280c;
        int i9 = iArr[1];
        if (i9 == i8) {
            l(this.f4279b[1]);
            return;
        }
        int i10 = i9 - 100;
        iArr[1] = i10;
        this.f4279b[1].setLevel(i10);
        this.f4279b[1].mutate().setColorFilter(this.f4278a.getResources().getColor(R.color.red), PorterDuff.Mode.SRC_IN);
        if (this.f4280c[1] >= i8) {
            this.f4286i[1].postDelayed(this.f4287j[1], 40L);
        } else {
            this.f4286i[1].removeCallbacks(this.f4287j[1]);
            this.f4281d[1] = i8;
        }
    }

    public void o(int i7, int i8) {
        int[] iArr = this.f4280c;
        int i9 = iArr[2];
        if (i9 == i8) {
            l(this.f4279b[2]);
            return;
        }
        int i10 = i9 - 100;
        iArr[2] = i10;
        this.f4279b[2].setLevel(i10);
        this.f4279b[2].mutate().setColorFilter(this.f4278a.getResources().getColor(R.color.red), PorterDuff.Mode.SRC_IN);
        if (this.f4280c[2] >= i8) {
            this.f4286i[2].postDelayed(this.f4287j[2], 40L);
        } else {
            this.f4286i[2].removeCallbacks(this.f4287j[2]);
            this.f4281d[2] = i8;
        }
    }

    public void p(int i7, int i8) {
        int[] iArr = this.f4280c;
        int i9 = iArr[3];
        if (i9 == i8) {
            l(this.f4279b[3]);
            return;
        }
        int i10 = i9 - 100;
        iArr[3] = i10;
        this.f4279b[3].setLevel(i10);
        this.f4279b[3].mutate().setColorFilter(this.f4278a.getResources().getColor(R.color.red), PorterDuff.Mode.SRC_IN);
        if (this.f4280c[3] >= i8) {
            this.f4286i[3].postDelayed(this.f4287j[3], 40L);
        } else {
            this.f4286i[3].removeCallbacks(this.f4287j[3]);
            this.f4281d[3] = i8;
        }
    }

    public void q(int i7, int i8) {
        int[] iArr = this.f4280c;
        int i9 = iArr[0];
        if (i9 == i8) {
            k(this.f4279b[0]);
            return;
        }
        int i10 = i9 + 100;
        iArr[0] = i10;
        this.f4279b[0].setLevel(i10);
        this.f4279b[0].mutate().setColorFilter(this.f4278a.getResources().getColor(R.color.green), PorterDuff.Mode.SRC_IN);
        if (this.f4280c[0] <= i8) {
            this.f4284g[0].postDelayed(this.f4285h[0], 40L);
        } else {
            this.f4284g[0].removeCallbacks(this.f4285h[0]);
            this.f4281d[0] = i8;
        }
    }

    public void r(int i7, int i8) {
        int[] iArr = this.f4280c;
        int i9 = iArr[1];
        if (i9 == i8) {
            k(this.f4279b[1]);
            return;
        }
        int i10 = i9 + 100;
        iArr[1] = i10;
        this.f4279b[1].setLevel(i10);
        this.f4279b[1].mutate().setColorFilter(this.f4278a.getResources().getColor(R.color.green), PorterDuff.Mode.SRC_IN);
        if (this.f4280c[1] <= i8) {
            this.f4284g[1].postDelayed(this.f4285h[1], 40L);
        } else {
            this.f4284g[1].removeCallbacks(this.f4285h[1]);
            this.f4281d[1] = i8;
        }
    }

    public void s(int i7, int i8) {
        int[] iArr = this.f4280c;
        int i9 = iArr[2];
        if (i9 == i8) {
            k(this.f4279b[2]);
            return;
        }
        int i10 = i9 + 100;
        iArr[2] = i10;
        this.f4279b[2].setLevel(i10);
        this.f4279b[2].mutate().setColorFilter(this.f4278a.getResources().getColor(R.color.green), PorterDuff.Mode.SRC_IN);
        if (this.f4280c[2] <= i8) {
            this.f4284g[2].postDelayed(this.f4285h[2], 40L);
        } else {
            this.f4284g[2].removeCallbacks(this.f4285h[2]);
            this.f4281d[2] = i8;
        }
    }

    public void t(int i7, int i8) {
        int[] iArr = this.f4280c;
        int i9 = iArr[3];
        if (i9 == i8) {
            k(this.f4279b[3]);
            return;
        }
        int i10 = i9 + 100;
        iArr[3] = i10;
        this.f4279b[3].setLevel(i10);
        this.f4279b[3].mutate().setColorFilter(this.f4278a.getResources().getColor(R.color.green), PorterDuff.Mode.SRC_IN);
        if (this.f4280c[3] <= i8) {
            this.f4284g[3].postDelayed(this.f4285h[3], 40L);
        } else {
            this.f4284g[3].removeCallbacks(this.f4285h[3]);
            this.f4281d[3] = i8;
        }
    }

    public void u(int[] iArr) {
        for (int i7 = 0; i7 < iArr.length; i7++) {
            int i8 = (iArr[i7] * 10000) / 100;
            int[] iArr2 = this.f4282e;
            int i9 = iArr2[i7];
            if (i9 != i8 || i8 < 10000) {
                if (i8 > 10000) {
                    i8 = i9;
                }
                iArr2[i7] = i8;
                int i10 = this.f4281d[i7];
                if (i8 > i10) {
                    this.f4286i[i7].removeCallbacks(this.f4287j[i7]);
                    this.f4281d[i7] = this.f4282e[i7];
                    this.f4284g[i7].post(this.f4285h[i7]);
                } else if (i8 < i10) {
                    this.f4284g[i7].removeCallbacks(this.f4285h[i7]);
                    this.f4281d[i7] = this.f4282e[i7];
                    this.f4286i[i7].post(this.f4287j[i7]);
                }
            }
        }
    }
}
