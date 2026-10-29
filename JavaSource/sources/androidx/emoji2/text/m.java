package androidx.emoji2.text;

import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: MyApplication */
public final class m extends SpannableStringBuilder {

    /* renamed from: q, reason: collision with root package name */
    private final Class f2081q;

    /* renamed from: r, reason: collision with root package name */
    private final List f2082r;

    /* compiled from: MyApplication */
    private static class a implements TextWatcher, SpanWatcher {

        /* renamed from: q, reason: collision with root package name */
        final Object f2083q;

        /* renamed from: r, reason: collision with root package name */
        private final AtomicInteger f2084r = new AtomicInteger(0);

        a(Object obj) {
            this.f2083q = obj;
        }

        private boolean b(Object obj) {
            return obj instanceof h;
        }

        final void a() {
            this.f2084r.incrementAndGet();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f2083q).afterTextChanged(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
            ((TextWatcher) this.f2083q).beforeTextChanged(charSequence, i7, i8, i9);
        }

        final void c() {
            this.f2084r.decrementAndGet();
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable, Object obj, int i7, int i8) {
            if (this.f2084r.get() <= 0 || !b(obj)) {
                ((SpanWatcher) this.f2083q).onSpanAdded(spannable, obj, i7, i8);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanChanged(Spannable spannable, Object obj, int i7, int i8, int i9, int i10) {
            if (this.f2084r.get() <= 0 || !b(obj)) {
                ((SpanWatcher) this.f2083q).onSpanChanged(spannable, obj, i7, i8, i9, i10);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i7, int i8) {
            if (this.f2084r.get() <= 0 || !b(obj)) {
                ((SpanWatcher) this.f2083q).onSpanRemoved(spannable, obj, i7, i8);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
            ((TextWatcher) this.f2083q).onTextChanged(charSequence, i7, i8, i9);
        }
    }

    m(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f2082r = new ArrayList();
        androidx.core.util.e.g(cls, "watcherClass cannot be null");
        this.f2081q = cls;
    }

    private void b() {
        for (int i7 = 0; i7 < this.f2082r.size(); i7++) {
            ((a) this.f2082r.get(i7)).a();
        }
    }

    public static m c(Class cls, CharSequence charSequence) {
        return new m(cls, charSequence);
    }

    private void e() {
        for (int i7 = 0; i7 < this.f2082r.size(); i7++) {
            ((a) this.f2082r.get(i7)).onTextChanged(this, 0, length(), length());
        }
    }

    private a f(Object obj) {
        for (int i7 = 0; i7 < this.f2082r.size(); i7++) {
            a aVar = (a) this.f2082r.get(i7);
            if (aVar.f2083q == obj) {
                return aVar;
            }
        }
        return null;
    }

    private boolean g(Class cls) {
        return this.f2081q == cls;
    }

    private boolean h(Object obj) {
        return obj != null && g(obj.getClass());
    }

    private void i() {
        for (int i7 = 0; i7 < this.f2082r.size(); i7++) {
            ((a) this.f2082r.get(i7)).c();
        }
    }

    public void a() {
        b();
    }

    public void d() {
        i();
        e();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(Object obj) {
        a f8;
        if (h(obj) && (f8 = f(obj)) != null) {
            obj = f8;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(Object obj) {
        a f8;
        if (h(obj) && (f8 = f(obj)) != null) {
            obj = f8;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(Object obj) {
        a f8;
        if (h(obj) && (f8 = f(obj)) != null) {
            obj = f8;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public Object[] getSpans(int i7, int i8, Class cls) {
        if (!g(cls)) {
            return super.getSpans(i7, i8, cls);
        }
        a[] aVarArr = (a[]) super.getSpans(i7, i8, a.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, aVarArr.length);
        for (int i9 = 0; i9 < aVarArr.length; i9++) {
            objArr[i9] = aVarArr[i9].f2083q;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int i7, int i8, Class cls) {
        if (cls == null || g(cls)) {
            cls = a.class;
        }
        return super.nextSpanTransition(i7, i8, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(Object obj) {
        a aVar;
        if (h(obj)) {
            aVar = f(obj);
            if (aVar != null) {
                obj = aVar;
            }
        } else {
            aVar = null;
        }
        super.removeSpan(obj);
        if (aVar != null) {
            this.f2082r.remove(aVar);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object obj, int i7, int i8, int i9) {
        if (h(obj)) {
            a aVar = new a(obj);
            this.f2082r.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i7, i8, i9);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public CharSequence subSequence(int i7, int i8) {
        return new m(this.f2081q, this, i7, i8);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder delete(int i7, int i8) {
        super.delete(i7, i8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder insert(int i7, CharSequence charSequence) {
        super.insert(i7, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i7, int i8, CharSequence charSequence) {
        b();
        super.replace(i7, i8, charSequence);
        i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder insert(int i7, CharSequence charSequence, int i8, int i9) {
        super.insert(i7, charSequence, i8, i9);
        return this;
    }

    m(Class cls, CharSequence charSequence, int i7, int i8) {
        super(charSequence, i7, i8);
        this.f2082r = new ArrayList();
        androidx.core.util.e.g(cls, "watcherClass cannot be null");
        this.f2081q = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i7, int i8, CharSequence charSequence, int i9, int i10) {
        b();
        super.replace(i7, i8, charSequence, i9, i10);
        i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(char c8) {
        super.append(c8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(CharSequence charSequence, int i7, int i8) {
        super.append(charSequence, i7, i8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i7) {
        super.append(charSequence, obj, i7);
        return this;
    }
}
