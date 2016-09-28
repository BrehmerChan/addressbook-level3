package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.storage.StorageFile.StorageOperationException;


/**
 * Represents the abstract class storage.
 */

public abstract class Storage {
    
    /**
     * Saves all data to this storage file.
     *
     * @throws StorageOperationException if there were errors converting and/or storing data to file.
     */
    public abstract void save(AddressBook addressBook) throws StorageOperationException;
    
    
    public abstract String getPath();
    
    /**
     * Loads data from this storage file.
     *
     * @throws StorageOperationException if there were errors reading and/or converting data from file.
     */
    public abstract AddressBook load() throws StorageOperationException;
      
}
