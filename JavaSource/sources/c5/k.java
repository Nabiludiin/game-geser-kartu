package c5;

import p3.o;

/* compiled from: MyApplication */
public abstract class k extends Exception {
    protected k() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str) {
        super(str);
        o.h(str, "Detail message must not be empty");
    }
}
