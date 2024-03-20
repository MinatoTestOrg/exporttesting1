import { Exporttesting1table1Base} from '@baseapp/exporttesting1table1/exporttesting1table1/exporttesting1table1.base.model';

export class Exporttesting1table1ApiConstants {
    public static readonly getDatatableData: any = {
        url: '/rest/exporttesting1table1s/datatable',
        method: 'POST',
        showloading: true
    };
    public static readonly update: any = {
        url: '/rest/exporttesting1table1s/',
        method: 'PUT',
        showloading: true
    };
    public static readonly create: any = {
        url: '/rest/exporttesting1table1s/',
        method: 'POST',
        showloading: true
    };
    public static readonly getById: any = {
        url: '/rest/exporttesting1table1s/{sid}',
        method: 'GET',
        showloading: true
    };
    public static readonly autoSuggestService: any = {
        url: '/rest/exporttesting1table1s/autosuggest',
        method: 'GET',
        showloading: true
    };
    public static readonly delete: any = {
        url: '/rest/exporttesting1table1s/{ids}',
        method: 'DELETE',
        showloading: true
    };
}