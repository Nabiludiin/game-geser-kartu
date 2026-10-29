package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: MyApplication */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    protected final r.a f2933a;

    /* renamed from: b, reason: collision with root package name */
    protected final r.a f2934b;

    /* renamed from: c, reason: collision with root package name */
    protected final r.a f2935c;

    public a(r.a aVar, r.a aVar2, r.a aVar3) {
        this.f2933a = aVar;
        this.f2934b = aVar2;
        this.f2935c = aVar3;
    }

    private void N(b1.a aVar) {
        try {
            I(c(aVar.getClass()).getName());
        } catch (ClassNotFoundException e8) {
            throw new RuntimeException(aVar.getClass().getSimpleName() + " does not have a Parcelizer", e8);
        }
    }

    private Class c(Class cls) {
        Class cls2 = (Class) this.f2935c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f2935c.put(cls.getName(), cls3);
        return cls3;
    }

    private Method d(String str) {
        Method method = (Method) this.f2933a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
        this.f2933a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Method e(Class cls) {
        Method method = (Method) this.f2934b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class c8 = c(cls);
        System.currentTimeMillis();
        Method declaredMethod = c8.getDeclaredMethod("write", cls, a.class);
        this.f2934b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    protected abstract void A(byte[] bArr);

    public void B(byte[] bArr, int i7) {
        w(i7);
        A(bArr);
    }

    protected abstract void C(CharSequence charSequence);

    public void D(CharSequence charSequence, int i7) {
        w(i7);
        C(charSequence);
    }

    protected abstract void E(int i7);

    public void F(int i7, int i8) {
        w(i8);
        E(i7);
    }

    protected abstract void G(Parcelable parcelable);

    public void H(Parcelable parcelable, int i7) {
        w(i7);
        G(parcelable);
    }

    protected abstract void I(String str);

    public void J(String str, int i7) {
        w(i7);
        I(str);
    }

    protected void K(b1.a aVar, a aVar2) {
        try {
            e(aVar.getClass()).invoke(null, aVar, aVar2);
        } catch (ClassNotFoundException e8) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e8);
        } catch (IllegalAccessException e9) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e9);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e10);
        } catch (InvocationTargetException e11) {
            if (!(e11.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e11);
            }
            throw ((RuntimeException) e11.getCause());
        }
    }

    protected void L(b1.a aVar) {
        if (aVar == null) {
            I(null);
            return;
        }
        N(aVar);
        a b8 = b();
        K(aVar, b8);
        b8.a();
    }

    public void M(b1.a aVar, int i7) {
        w(i7);
        L(aVar);
    }

    protected abstract void a();

    protected abstract a b();

    public boolean f() {
        return false;
    }

    protected abstract boolean g();

    public boolean h(boolean z7, int i7) {
        return !m(i7) ? z7 : g();
    }

    protected abstract byte[] i();

    public byte[] j(byte[] bArr, int i7) {
        return !m(i7) ? bArr : i();
    }

    protected abstract CharSequence k();

    public CharSequence l(CharSequence charSequence, int i7) {
        return !m(i7) ? charSequence : k();
    }

    protected abstract boolean m(int i7);

    protected b1.a n(String str, a aVar) {
        try {
            return (b1.a) d(str).invoke(null, aVar);
        } catch (ClassNotFoundException e8) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e8);
        } catch (IllegalAccessException e9) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e9);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e10);
        } catch (InvocationTargetException e11) {
            if (e11.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e11.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e11);
        }
    }

    protected abstract int o();

    public int p(int i7, int i8) {
        return !m(i8) ? i7 : o();
    }

    protected abstract Parcelable q();

    public Parcelable r(Parcelable parcelable, int i7) {
        return !m(i7) ? parcelable : q();
    }

    protected abstract String s();

    public String t(String str, int i7) {
        return !m(i7) ? str : s();
    }

    protected b1.a u() {
        String s7 = s();
        if (s7 == null) {
            return null;
        }
        return n(s7, b());
    }

    public b1.a v(b1.a aVar, int i7) {
        return !m(i7) ? aVar : u();
    }

    protected abstract void w(int i7);

    protected abstract void y(boolean z7);

    public void z(boolean z7, int i7) {
        w(i7);
        y(z7);
    }

    public void x(boolean z7, boolean z8) {
    }
}
