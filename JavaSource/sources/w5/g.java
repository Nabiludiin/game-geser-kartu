package w5;

import java.io.IOException;
import java.io.StringWriter;

/* compiled from: MyApplication */
public abstract class g {
    public e c() {
        if (h()) {
            return (e) this;
        }
        throw new IllegalStateException("This is not a JSON Array.");
    }

    public j e() {
        if (j()) {
            return (j) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public l g() {
        if (k()) {
            return (l) this;
        }
        throw new IllegalStateException("This is not a JSON Primitive.");
    }

    public boolean h() {
        return this instanceof e;
    }

    public boolean i() {
        return this instanceof i;
    }

    public boolean j() {
        return this instanceof j;
    }

    public boolean k() {
        return this instanceof l;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            b6.c cVar = new b6.c(stringWriter);
            cVar.B(true);
            y5.j.a(this, cVar);
            return stringWriter.toString();
        } catch (IOException e8) {
            throw new AssertionError(e8);
        }
    }
}
