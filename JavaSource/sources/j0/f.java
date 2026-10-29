package j0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* compiled from: MyApplication */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final b f24224a;

    /* compiled from: MyApplication */
    private static class a extends b {

        /* renamed from: a, reason: collision with root package name */
        private final TextView f24225a;

        /* renamed from: b, reason: collision with root package name */
        private final d f24226b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f24227c = true;

        a(TextView textView) {
            this.f24225a = textView;
            this.f24226b = new d(textView);
        }

        private InputFilter[] d(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f24226b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f24226b;
            return inputFilterArr2;
        }

        private SparseArray e(InputFilter[] inputFilterArr) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i7 = 0; i7 < inputFilterArr.length; i7++) {
                InputFilter inputFilter = inputFilterArr[i7];
                if (inputFilter instanceof d) {
                    sparseArray.put(i7, inputFilter);
                }
            }
            return sparseArray;
        }

        private InputFilter[] f(InputFilter[] inputFilterArr) {
            SparseArray e8 = e(inputFilterArr);
            if (e8.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - e8.size()];
            int i7 = 0;
            for (int i8 = 0; i8 < length; i8++) {
                if (e8.indexOfKey(i8) < 0) {
                    inputFilterArr2[i7] = inputFilterArr[i8];
                    i7++;
                }
            }
            return inputFilterArr2;
        }

        private TransformationMethod h(TransformationMethod transformationMethod) {
            return transformationMethod instanceof h ? ((h) transformationMethod).a() : transformationMethod;
        }

        private void i() {
            this.f24225a.setFilters(a(this.f24225a.getFilters()));
        }

        private TransformationMethod k(TransformationMethod transformationMethod) {
            return transformationMethod instanceof h ? transformationMethod : transformationMethod instanceof PasswordTransformationMethod ? transformationMethod : new h(transformationMethod);
        }

        @Override // j0.f.b
        InputFilter[] a(InputFilter[] inputFilterArr) {
            return !this.f24227c ? f(inputFilterArr) : d(inputFilterArr);
        }

        @Override // j0.f.b
        void b(boolean z7) {
            if (z7) {
                j();
            }
        }

        @Override // j0.f.b
        void c(boolean z7) {
            this.f24227c = z7;
            j();
            i();
        }

        void g(boolean z7) {
            this.f24227c = z7;
        }

        void j() {
            this.f24225a.setTransformationMethod(l(this.f24225a.getTransformationMethod()));
        }

        TransformationMethod l(TransformationMethod transformationMethod) {
            return this.f24227c ? k(transformationMethod) : h(transformationMethod);
        }
    }

    /* compiled from: MyApplication */
    static class b {
        b() {
        }

        abstract InputFilter[] a(InputFilter[] inputFilterArr);

        abstract void b(boolean z7);

        abstract void c(boolean z7);
    }

    /* compiled from: MyApplication */
    private static class c extends b {

        /* renamed from: a, reason: collision with root package name */
        private final a f24228a;

        c(TextView textView) {
            this.f24228a = new a(textView);
        }

        private boolean d() {
            return !androidx.emoji2.text.d.h();
        }

        @Override // j0.f.b
        InputFilter[] a(InputFilter[] inputFilterArr) {
            return d() ? inputFilterArr : this.f24228a.a(inputFilterArr);
        }

        @Override // j0.f.b
        void b(boolean z7) {
            if (d()) {
                return;
            }
            this.f24228a.b(z7);
        }

        @Override // j0.f.b
        void c(boolean z7) {
            if (d()) {
                this.f24228a.g(z7);
            } else {
                this.f24228a.c(z7);
            }
        }
    }

    public f(TextView textView, boolean z7) {
        androidx.core.util.e.g(textView, "textView cannot be null");
        if (z7) {
            this.f24224a = new a(textView);
        } else {
            this.f24224a = new c(textView);
        }
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f24224a.a(inputFilterArr);
    }

    public void b(boolean z7) {
        this.f24224a.b(z7);
    }

    public void c(boolean z7) {
        this.f24224a.c(z7);
    }
}
