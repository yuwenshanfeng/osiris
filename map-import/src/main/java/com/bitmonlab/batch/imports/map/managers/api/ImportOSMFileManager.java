package com.bitmonlab.batch.imports.map.managers.api;

import java.io.IOException;
import java.io.InputStream;
import java.security.NoSuchAlgorithmException;

import com.bitmonlab.batch.imports.map.exceptions.BackgroundMapBuilderException;
import com.bitmonlab.batch.imports.map.exceptions.ExecutionNotAllowed;
import com.bitmonlab.batch.imports.map.exceptions.GraphBuilderException;
import com.bitmonlab.batch.imports.map.exceptions.ImportFilesException;
import com.bitmonlab.batch.imports.map.exceptions.InternalErrorException;
import com.bitmonlab.batch.imports.map.exceptions.ParseMapException;
import com.bitmonlab.batch.imports.map.exceptions.QueryException;
import com.bitmonlab.batch.imports.map.exceptions.RoutingFileNotExistsException;

public interface ImportOSMFileManager {	

	void importOSMFile(final String appIdentifier, final InputStream data, boolean bGraphBuilder) throws ExecutionNotAllowed, InternalErrorException, ParseMapException, QueryException, IOException, NoSuchAlgorithmException, BackgroundMapBuilderException, ImportFilesException, RoutingFileNotExistsException, GraphBuilderException;

}
