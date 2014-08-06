package test;

import org.bouncycastle.crypto.util.PublicKeyFactory;

public class DependentClass {
  public Object method() throws Exception {
    PublicKeyFactory factory = new PublicKeyFactory();
	return factory.createKey(new byte[] { 0x1 });
  }
}