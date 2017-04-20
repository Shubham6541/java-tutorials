import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';

import { nklkarthiPostModule } from './post/post.module';
import { nklkarthiCommentModule } from './comment/comment.module';
/* jhipster-needle-add-entity-module-import - JHipster will add entity modules imports here */

@NgModule({
    imports: [
        nklkarthiPostModule,
        nklkarthiCommentModule,
        /* jhipster-needle-add-entity-module - JHipster will add entity modules here */
    ],
    declarations: [],
    entryComponents: [],
    providers: [],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class nklkarthiEntityModule {}
