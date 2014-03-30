/*
 * Copyright 2009-2013 by The Regents of the University of California
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * you may obtain a copy of the License from
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package edu.uci.ics.hyracks.storage.am.lsm.invertedindex.inmemory;

import edu.uci.ics.hyracks.api.exceptions.HyracksDataException;
import edu.uci.ics.hyracks.storage.am.common.api.IIndexOperationContext;
import edu.uci.ics.hyracks.storage.am.lsm.invertedindex.api.IInvertedIndexSearcher;
import edu.uci.ics.hyracks.storage.am.lsm.invertedindex.search.PartitionedTOccurrenceSearcher;

public class PartitionedInMemoryInvertedIndexAccessor extends InMemoryInvertedIndexAccessor {

    public PartitionedInMemoryInvertedIndexAccessor(InMemoryInvertedIndex index, IIndexOperationContext opCtx)
            throws HyracksDataException {
        super(index, opCtx);
    }

    protected IInvertedIndexSearcher createSearcher() throws HyracksDataException {
        return new PartitionedTOccurrenceSearcher(hyracksCtx, index);
    }
}