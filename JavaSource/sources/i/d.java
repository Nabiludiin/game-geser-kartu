package i;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import i.b;

/* compiled from: MyApplication */
abstract class d extends b {
    private a C;
    private boolean D;

    /* compiled from: MyApplication */
    static class a extends b.d {
        int[][] J;

        a(a aVar, d dVar, Resources resources) {
            super(aVar, dVar, resources);
            if (aVar != null) {
                this.J = aVar.J;
            } else {
                this.J = new int[f()][];
            }
        }

        int A(int[] iArr) {
            int[][] iArr2 = this.J;
            int h8 = h();
            for (int i7 = 0; i7 < h8; i7++) {
                if (StateSet.stateSetMatches(iArr2[i7], iArr)) {
                    return i7;
                }
            }
            return -1;
        }

        @Override // i.b.d
        public void o(int i7, int i8) {
            super.o(i7, i8);
            int[][] iArr = new int[i8][];
            System.arraycopy(this.J, 0, iArr, 0, i7);
            this.J = iArr;
        }

        @Override // i.b.d
        abstract void r();

        int z(int[] iArr, Drawable drawable) {
            int a8 = a(drawable);
            this.J[a8] = iArr;
            return a8;
        }
    }

    d(a aVar) {
        if (aVar != null) {
            h(aVar);
        }
    }

    @Override // i.b, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // i.b
    void h(b.d dVar) {
        super.h(dVar);
        if (dVar instanceof a) {
            this.C = (a) dVar;
        }
    }

    int[] j(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i7 = 0;
        for (int i8 = 0; i8 < attributeCount; i8++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i8);
            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                int i9 = i7 + 1;
                if (!attributeSet.getAttributeBooleanValue(i8, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i7] = attributeNameResource;
                i7 = i9;
            }
        }
        return StateSet.trimStateSet(iArr, i7);
    }

    @Override // i.b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.D && super.mutate() == this) {
            this.C.r();
            this.D = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected abstract boolean onStateChange(int[] iArr);
}
