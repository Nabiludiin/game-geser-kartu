package w3;

import android.os.IBinder;
import java.lang.reflect.Field;
import p3.o;
import w3.a;

/* compiled from: MyApplication */
public final class b extends a.AbstractBinderC0140a {

    /* renamed from: q, reason: collision with root package name */
    private final Object f27104q;

    private b(Object obj) {
        this.f27104q = obj;
    }

    public static a C1(Object obj) {
        return new b(obj);
    }

    public static Object r0(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).f27104q;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i7 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i7++;
                field = field2;
            }
        }
        if (i7 != 1) {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
        o.m(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(asBinder);
        } catch (IllegalAccessException e8) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e8);
        } catch (NullPointerException e9) {
            throw new IllegalArgumentException("Binder object is null.", e9);
        }
    }
}
