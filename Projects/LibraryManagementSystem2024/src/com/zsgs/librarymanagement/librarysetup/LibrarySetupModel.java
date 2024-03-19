package com.zsgs.librarymanagement.librarysetup;

import com.zsgs.librarymanagement.datalayer.LibraryDatabase;
import com.zsgs.librarymanagement.model.Library;

public class LibrarySetupModel {
	private LibrarySetupView librarySetupView;

	private Library library = new Library();

	LibrarySetupModel(LibrarySetupView librarySetupView) {
		this.librarySetupView = librarySetupView;
		library=LibraryDatabase.getInstance().getLibrary();
	}

	public void startSetup() {		
			librarySetupView.initiateSetup();
	}

	public void createLibrary(Library library) {
		if (library.getLibraryName().length() <3  || library.getLibraryName().length() > 50) {
			librarySetupView.showAlert("Enter valid name");
			return;
		}
		this.library=LibraryDatabase.getInstance().insertLibrary(library);
		library.setLibraryId(1);
		librarySetupView.onSetupComplete(library);
	}
}
