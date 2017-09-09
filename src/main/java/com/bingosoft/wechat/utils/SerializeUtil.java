package com.bingosoft.wechat.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeUtil {
	public static byte[] Serialize(Object object) {
        ObjectOutputStream oos = null;
         ByteArrayOutputStream baos = null;
         try {
              // 序列化
             baos = new ByteArrayOutputStream();
             oos = new ObjectOutputStream(baos);
             oos.writeObject(object);
              byte[] bytes = baos.toByteArray();
              return bytes;
        } catch (Exception e) {

        }
         return null;
  }

   public static Object deSerialize( byte[] bytes) {
        ByteArrayInputStream bais = null;
         try {
              // 反序列化
             bais = new ByteArrayInputStream(bytes);
             ObjectInputStream ois = new ObjectInputStream(bais);
              return ois.readObject();
        } catch (Exception e) {

        }
         return null;
  }
}
