package packSer.demoSer08;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable {
	private transient Collar theCollar;
	private int dogSize;

	public Dog(Collar collar, int size) {
		theCollar = collar;
		dogSize = size;
	}

	public Collar getCollar() {
		return theCollar;
	}

	private void writeObject(ObjectOutputStream os) {
		// throws IOException { // 1
		try {
			os.defaultWriteObject(); 
			/* void defaultWriteObject()
			 * 
		     * Write the non-static and non-transient fields of the current class to
		     * this stream. This may only be called from the writeObject method of the
		     * class being serialized. It will throw the NotActiveException if it is
		     * called otherwise.
		     *
		     * @throws  IOException if I/O errors occur while writing to the underlying
		     *          <code>OutputStream</code>
		     */
			os.writeInt(theCollar.getCollarSize()); 
			/* void writeInt(int val)
		     * 
		     * Writes a 32 bit int.
		     *
		     * @param   val the integer value to be written
		     * @throws  IOException if I/O errors occur while writing to the underlying
		     *          stream
		     */
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void readObject(ObjectInputStream is) {
		// throws IOException, ClassNotFoundException { // 4
		try {
			is.defaultReadObject(); 
			 /*
			 * void defaultReadObject()
			 * 
		     * Read the non-static and non-transient fields of the current class from
		     * this stream.  This may only be called from the readObject method of the
		     * class being deserialized. It will throw the NotActiveException if it is
		     * called otherwise.
		     *
		     * @throws  ClassNotFoundException if the class of a serialized object
		     *          could not be found.
		     * @throws  IOException if an I/O error occurs.
		     * @throws  NotActiveException if the stream is not currently reading
		     *          objects.
		     */
			theCollar = new Collar(is.readInt()); 
			/*
		     * int readInt()
		     * 
		     * Reads a 32 bit int.
		     *
		     * @return  the 32 bit integer read.
		     * @throws  EOFException If end of file is reached.
		     * @throws  IOException If other I/O error has occurred.
		     */
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Hund";
	}
}
