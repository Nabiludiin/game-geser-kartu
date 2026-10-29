package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.d;
import androidx.emoji2.text.l;
import java.util.Arrays;

/* compiled from: MyApplication */
final class g {

    /* renamed from: a, reason: collision with root package name */
    private final d.i f2040a;

    /* renamed from: b, reason: collision with root package name */
    private final l f2041b;

    /* renamed from: c, reason: collision with root package name */
    private d.InterfaceC0036d f2042c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f2043d;

    /* renamed from: e, reason: collision with root package name */
    private final int[] f2044e;

    /* compiled from: MyApplication */
    private static final class a {
        static int a(CharSequence charSequence, int i7, int i8) {
            int length = charSequence.length();
            if (i7 < 0 || length < i7 || i8 < 0) {
                return -1;
            }
            while (true) {
                boolean z7 = false;
                while (i8 != 0) {
                    i7--;
                    if (i7 < 0) {
                        return z7 ? -1 : 0;
                    }
                    char charAt = charSequence.charAt(i7);
                    if (z7) {
                        if (!Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        i8--;
                    } else if (!Character.isSurrogate(charAt)) {
                        i8--;
                    } else {
                        if (Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        z7 = true;
                    }
                }
                return i7;
            }
        }

        static int b(CharSequence charSequence, int i7, int i8) {
            int length = charSequence.length();
            if (i7 < 0 || length < i7 || i8 < 0) {
                return -1;
            }
            while (true) {
                boolean z7 = false;
                while (i8 != 0) {
                    if (i7 >= length) {
                        if (z7) {
                            return -1;
                        }
                        return length;
                    }
                    char charAt = charSequence.charAt(i7);
                    if (z7) {
                        if (!Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i8--;
                        i7++;
                    } else if (!Character.isSurrogate(charAt)) {
                        i8--;
                        i7++;
                    } else {
                        if (Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i7++;
                        z7 = true;
                    }
                }
                return i7;
            }
        }
    }

    /* compiled from: MyApplication */
    public static class b implements d.InterfaceC0036d {

        /* renamed from: b, reason: collision with root package name */
        private static final ThreadLocal f2045b = new ThreadLocal();

        /* renamed from: a, reason: collision with root package name */
        private final TextPaint f2046a;

        b() {
            TextPaint textPaint = new TextPaint();
            this.f2046a = textPaint;
            textPaint.setTextSize(10.0f);
        }

        private static StringBuilder b() {
            ThreadLocal threadLocal = f2045b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            return (StringBuilder) threadLocal.get();
        }

        @Override // androidx.emoji2.text.d.InterfaceC0036d
        public boolean a(CharSequence charSequence, int i7, int i8, int i9) {
            StringBuilder b8 = b();
            b8.setLength(0);
            while (i7 < i8) {
                b8.append(charSequence.charAt(i7));
                i7++;
            }
            return androidx.core.graphics.g.a(this.f2046a, b8.toString());
        }
    }

    /* compiled from: MyApplication */
    static final class c {

        /* renamed from: a, reason: collision with root package name */
        private int f2047a = 1;

        /* renamed from: b, reason: collision with root package name */
        private final l.a f2048b;

        /* renamed from: c, reason: collision with root package name */
        private l.a f2049c;

        /* renamed from: d, reason: collision with root package name */
        private l.a f2050d;

        /* renamed from: e, reason: collision with root package name */
        private int f2051e;

        /* renamed from: f, reason: collision with root package name */
        private int f2052f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f2053g;

        /* renamed from: h, reason: collision with root package name */
        private final int[] f2054h;

        c(l.a aVar, boolean z7, int[] iArr) {
            this.f2048b = aVar;
            this.f2049c = aVar;
            this.f2053g = z7;
            this.f2054h = iArr;
        }

        private static boolean d(int i7) {
            return i7 == 65039;
        }

        private static boolean f(int i7) {
            return i7 == 65038;
        }

        private int g() {
            this.f2047a = 1;
            this.f2049c = this.f2048b;
            this.f2052f = 0;
            return 1;
        }

        private boolean h() {
            if (this.f2049c.b().j() || d(this.f2051e)) {
                return true;
            }
            if (this.f2053g) {
                if (this.f2054h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f2054h, this.f2049c.b().b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        int a(int i7) {
            l.a a8 = this.f2049c.a(i7);
            int i8 = 2;
            if (this.f2047a != 2) {
                if (a8 == null) {
                    i8 = g();
                } else {
                    this.f2047a = 2;
                    this.f2049c = a8;
                    this.f2052f = 1;
                }
            } else if (a8 != null) {
                this.f2049c = a8;
                this.f2052f++;
            } else if (f(i7)) {
                i8 = g();
            } else if (!d(i7)) {
                if (this.f2049c.b() != null) {
                    i8 = 3;
                    if (this.f2052f != 1) {
                        this.f2050d = this.f2049c;
                        g();
                    } else if (h()) {
                        this.f2050d = this.f2049c;
                        g();
                    } else {
                        i8 = g();
                    }
                } else {
                    i8 = g();
                }
            }
            this.f2051e = i7;
            return i8;
        }

        f b() {
            return this.f2049c.b();
        }

        f c() {
            return this.f2050d.b();
        }

        boolean e() {
            if (this.f2047a != 2 || this.f2049c.b() == null) {
                return false;
            }
            return this.f2052f > 1 || h();
        }
    }

    g(l lVar, d.i iVar, d.InterfaceC0036d interfaceC0036d, boolean z7, int[] iArr) {
        this.f2040a = iVar;
        this.f2041b = lVar;
        this.f2042c = interfaceC0036d;
        this.f2043d = z7;
        this.f2044e = iArr;
    }

    private void a(Spannable spannable, f fVar, int i7, int i8) {
        spannable.setSpan(this.f2040a.a(fVar), i7, i8, 33);
    }

    private static boolean b(Editable editable, KeyEvent keyEvent, boolean z7) {
        h[] hVarArr;
        if (g(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!f(selectionStart, selectionEnd) && (hVarArr = (h[]) editable.getSpans(selectionStart, selectionEnd, h.class)) != null && hVarArr.length > 0) {
            for (h hVar : hVarArr) {
                int spanStart = editable.getSpanStart(hVar);
                int spanEnd = editable.getSpanEnd(hVar);
                if ((z7 && spanStart == selectionStart) || ((!z7 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    static boolean c(InputConnection inputConnection, Editable editable, int i7, int i8, boolean z7) {
        int max;
        int min;
        if (editable != null && inputConnection != null && i7 >= 0 && i8 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (f(selectionStart, selectionEnd)) {
                return false;
            }
            if (z7) {
                max = a.a(editable, selectionStart, Math.max(i7, 0));
                min = a.b(editable, selectionEnd, Math.max(i8, 0));
                if (max == -1 || min == -1) {
                    return false;
                }
            } else {
                max = Math.max(selectionStart - i7, 0);
                min = Math.min(selectionEnd + i8, editable.length());
            }
            h[] hVarArr = (h[]) editable.getSpans(max, min, h.class);
            if (hVarArr != null && hVarArr.length > 0) {
                for (h hVar : hVarArr) {
                    int spanStart = editable.getSpanStart(hVar);
                    int spanEnd = editable.getSpanEnd(hVar);
                    max = Math.min(spanStart, max);
                    min = Math.max(spanEnd, min);
                }
                int max2 = Math.max(max, 0);
                int min2 = Math.min(min, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(max2, min2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    static boolean d(Editable editable, int i7, KeyEvent keyEvent) {
        if (!(i7 != 67 ? i7 != 112 ? false : b(editable, keyEvent, true) : b(editable, keyEvent, false))) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    private boolean e(CharSequence charSequence, int i7, int i8, f fVar) {
        if (fVar.d() == 0) {
            fVar.k(this.f2042c.a(charSequence, i7, i8, fVar.h()));
        }
        return fVar.d() == 2;
    }

    private static boolean f(int i7, int i8) {
        return i7 == -1 || i8 == -1 || i7 != i8;
    }

    private static boolean g(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044 A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:97:0x000e, B:100:0x0013, B:102:0x0017, B:104:0x0024, B:9:0x0035, B:11:0x003d, B:13:0x0040, B:15:0x0044, B:17:0x0050, B:19:0x0053, B:23:0x0060, B:29:0x006f, B:30:0x007b, B:34:0x0096, B:60:0x00a6, B:64:0x00b2, B:65:0x00b7, B:47:0x00c1, B:50:0x00c8, B:37:0x00cd, B:39:0x00d8, B:71:0x00df, B:75:0x00e9, B:78:0x00f5, B:79:0x00fa, B:6:0x002f), top: B:96:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f5 A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:97:0x000e, B:100:0x0013, B:102:0x0017, B:104:0x0024, B:9:0x0035, B:11:0x003d, B:13:0x0040, B:15:0x0044, B:17:0x0050, B:19:0x0053, B:23:0x0060, B:29:0x006f, B:30:0x007b, B:34:0x0096, B:60:0x00a6, B:64:0x00b2, B:65:0x00b7, B:47:0x00c1, B:50:0x00c8, B:37:0x00cd, B:39:0x00d8, B:71:0x00df, B:75:0x00e9, B:78:0x00f5, B:79:0x00fa, B:6:0x002f), top: B:96:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.lang.CharSequence h(java.lang.CharSequence r11, int r12, int r13, int r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.g.h(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }
}
